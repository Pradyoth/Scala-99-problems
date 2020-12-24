import java.util.NoSuchElementException

def kthElementOfList[A](n:Int,ls:List[A]):A = {
  if (n>=0) return ls(n)
  else throw new NoSuchElementException
}

kthElementOfList(4,List(1,2,3,4,5,6))

