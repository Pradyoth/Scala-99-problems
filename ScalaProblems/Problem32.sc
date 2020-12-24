object P32{

  def gcd(m:Int,n:Int):Int =
  {
    if (n==0)m
    else gcd(n,m%n)

  }
}

P32.gcd(12,5)



