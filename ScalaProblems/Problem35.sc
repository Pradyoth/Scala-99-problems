class S99Int(val start: Int) {


  def isPrime(number:Int): Boolean ={
    if (number==1)
      false
    else if (number==2)
      true
    else
      !(2 to number -1).exists(x => number %x==0)
  }
  val primes: Stream[Int]
  = 2 #:: Stream.from(3).filter { n => !primes.takeWhile(_ <= math.sqrt(n)).exists(n % _ == 0) }
  def primeFactors: List[Int] = {
    def primeFactorsR(n: Int, ps: Stream[Int]): List[Int] =
      if (isPrime(n)) List(n)
      else if (n % ps.head == 0) ps.head :: primeFactorsR(n / ps.head, ps)
      else primeFactorsR(n, ps.tail)
    primeFactorsR(start, primes)
  }
}

val xs = new S99Int(315)

xs.primeFactors