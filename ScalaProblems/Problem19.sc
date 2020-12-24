import scala.collection.JavaConverters._

object P19 {

  def rotate[A](Index:Int,ls:List[A]):List[A]=
  {

    (Index,ls) match {

      case (_,Nil) => Nil

      case(0,h::tail) => h::tail






      case (n,h::tail) => {


        rotate(n - 1, tail ::: List(h))
      }
    }
  }

}

P19.rotate(4,List('a','b','c','d','e'))




