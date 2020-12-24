sealed abstract class Tree[+T]{

  def leafCount: Int
}

class Node[+T](value: T , left: Tree[T],right:Tree[T]) extends Tree[T]{

  def leafCount:Int = (left,right) match {

    case (End,End) => 1

    case _ => left.leafCount + right.leafCount
  }

  override def toString: String = this.value + " "
}


case object End extends Tree[Nothing] {
  def leafCount: Int = 0
}

var xs = new Node('a',new Node('b',End,End),new Node('c',End,End))

xs.leafCount







