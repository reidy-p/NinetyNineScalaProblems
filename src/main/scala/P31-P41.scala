package arithmetic {

  class S99Int(val start: Int) {
    import S99Int._

    // P31
    /** A method to check whether an Int is prime based on the trial divison
      * method. This method divides the Int by every number from 2 to the
      * square root of the Int. If the Int divides evenly by any number in
      * this range it is not a Prime Number. Otherwise it is a Prime Number
      * This method is not efficient for large Ints.
      */
    def isPrime: Boolean = {
      import math.sqrt
      val testNumbers = 2 to sqrt(start).toInt
      // Stop if any number divides evenly
      val res = testNumbers.takeWhile(start % _ != 0)
      start > 1 && res.length == testNumbers.length
    }

    // P33
    def isCoprimeTo(other: Int): Boolean = gcdEuclidImproved(start, other) == 1

    // P34
    def totient: Int = (1 to start).count(_.isCoprimeTo(start))

    // P35
    def primeFactors: List[Int] = {
      def primeFactorsInner(n: Int, p: Stream[Int]): List[Int] = {
        if (n <= 1) Nil
        // Number is divisible by current prime. Reduce number and carry on
        else if (n % p.head == 0) p.head :: primeFactorsInner(n / p.head, p)
        // Number is not divisible by current prime. Try next prime
        else primeFactorsInner(n, p.tail)
      }
      primeFactorsInner(start, primes)
    }

    // P36
    def primeFactorsMultiplicity: Map[Int, Int] = {
      start.primeFactors.groupBy(identity).mapValues(_.size)
    }

    // P37
    def totientImproved: Int = {
      start.primeFactorsMultiplicity.foldLeft(1){
        (acc, primeFactors) =>
          val (p, m) = primeFactors
          acc*(p - 1)*Math.pow(p, m - 1).toInt
      }
    }

    // P40
    /**
      * My solution for the Golbach conjecture. It may be inefficient because
      * I have to keep track of two Streams of primes rather than just one
      * @return a tuple of prime numbers that sum to start
      */
    def goldbachInefficient: (Int, Int) = {
      def golbachInner(x: Stream[Int], y: Stream[Int]): (Int, Int) = {
       val p1 = x.head
       val p2 = y.head
       if (p1 + p2 > start) golbachInner(x.tail, x.tail)
       else if (p1 + p2 == start) (p1, p2)
       else golbachInner(x, y.tail)
      }
      golbachInner(primes, primes)
    }

    /**
      * Provided solution which seems more efficient because it only uses one
      * list of primes
      * @return a tuple of prime numbers that sum to start
      */
    def golbachEfficient: (Int, Int) = {
      primes takeWhile { _ < start } find { p => (start - p).isPrime } match {
        case None => throw new IllegalArgumentException
        case Some(p1) => (p1, start - p1)
      }
    }


  }

  object S99Int {
    implicit def int2S99Int(i: Int): S99Int = new S99Int(i)

    val primes = 2 #:: Stream.from(start = 3, step = 2).filter(_.isPrime)

    // P32
    def gcdEuclid(num1: Int, num2: Int): Int = {
      if (num1 == num2) num1
      else if (num1 > num2) {
        gcdEuclid(num2, num1 - num2)
      } else gcdEuclid(num1, num2 - num1)
    }

    def gcdEuclidImproved(num1: Int, num2: Int): Int = {
      if (num2 == 0) num1
      else gcdEuclidImproved(num2, num1 % num2)
    }

    // P39
    def listPrimesInRange(r: Range): List[Int] = {
      r.filter(_.isPrime).toList
    }

    // P41
    def printGolbachList(r: Range) = {
      val even = r.filter(_ % 2 == 0)
      even.foreach {
        num =>
          val (prime1, prime2) = num.golbachEfficient
          println(num + " = " + prime1 + " + " + prime2)
      }
    }

    def printGoldbachListLimited(r: Range, limit: Int) = {
      val even = r.filter(_ % 2 == 0)
      even.map{
        num =>
          val (prime1, prime2) = num.golbachEfficient
          (num, prime1, prime2)
      }.filter(res => res._2 > limit && res._3 > limit)
       .foreach{
         num =>
            println(num._1 + " = " + num._2 + " + " + num._3)
       }
    }

  }

}