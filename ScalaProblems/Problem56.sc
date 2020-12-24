sealed abstract class Tree[+T] {
  def isMirrorOf[T](tree: Tree[T]): Boolean
  def isSymmetric: Boolean
}


case class Node[+T](value:T,left:Tree[T],right:Tree[T]) extends Tree[T] {

  def isMirrorOf[T](tree:Tree[T]):Boolean = tree match {

    case t: Node[T] => left.isMirrorOf(t.right) && right.isMirrorOf(t.left)


    case _ => false

  }


      def isSymmetric: Boolean = {

        left.isMirrorOf(right)

      }


  }








case object End extends Tree[Nothing] {
  def isMirrorOf[T](tree: Tree[T]): Boolean = tree == End
  def isSymmetric: Boolean = true
}



var xs = new Node('a',new Node('b',End,End),End)

xs.isSymmetric






