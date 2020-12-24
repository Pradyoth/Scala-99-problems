class S99Int(val start: Int) {

  def gcd(m:Int,n:Int):Int =
    if (n==0) m

    else
      gcd(n,m%n)






  def isCoprimeTo(n: Int): Boolean = gcd(start, n) == 1



}

val x = new S99Int(11)
var count = 0
var i = 1
for ( i <- 1 to 10)
{
  if (x.isCoprimeTo(i))
    count = count + 1



}

println(count)




