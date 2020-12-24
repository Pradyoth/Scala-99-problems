def duplicate[A](n : Int,ls:List[A]):List[A]=
{
  ls flatMap { List.make(n,_)}
}

duplicate(3,List('a','b','c','d','e'))



