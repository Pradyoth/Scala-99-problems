def duplicate[A](ls:List[A]):List[A] =
{

  ls flatMap{ e => List(e,e) }

}
duplicate(List('a','b','c','d','e'))

