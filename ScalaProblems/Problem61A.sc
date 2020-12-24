
sealed abstract class Tree[+T]{

  def leafCount:Int = leafList.length

  def leafList:List[T]
}


class Node[+T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T] {
  def leafList: List[T] = (left, right) match {

    case (End, End) => List(value)
    case _          => left.leafList ::: right.leafList
  }

  override def toString: String = this.value + ""
}


case object End extends Tree[Nothing] {
  def leafList = Nil
}

//var xs = new Node[Char]('a',new Node[Char]('b', End, End),new Node[Char]('c',new Node[Char]('d', End, End),new Node[Char]('e', End, End)))






var xs = new Node('a', new Node('b', End, End), new Node('c', new Node('d', End, End), new Node('e', End, End)))

xs.leafList

