

sealed abstract class Tree[+T]
case class Node[+T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T] {
  override def toString = "T(" + value.toString + " " + left.toString + " " + right.toString + ")"
}
case object End extends Tree[Nothing] {
  override def toString = "."
}
object Node {
  def apply[T](value: T): Node[T] = Node(value, End, End)
}

def cBalanced[T](nodes:Int,value:T):List[Tree[T]] = {

nodes match {

  case n if n < 1 => List(End)

  case n if (n %2 ==1) =>
    val subtrees = cBalanced(n/2,value)
    subtrees.map(temp => Node(value,temp,temp))
  case n if (n % 2 ==0) =>
    val subtrees = cBalanced(n/2,value)
    subtrees.flatMap(temp=> List(Node(value,temp,End),Node(value,End,temp)))





}
}
cBalanced(4,"x")
