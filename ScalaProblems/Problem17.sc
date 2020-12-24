object P17{

  def splitRecursive[A](n:Int,ls:List[A]):(List[A],List[A]) = (n,ls) match{


    case (_,Nil) => (Nil,Nil)

    case (0,ls)  => (Nil,ls)


    case (n,h::tail) =>{


      val (pre , post) = splitRecursive(n-1,tail)

      (h::pre,post)
    }


  }






}

P17.splitRecursive(1,List('a','b','c','d','e','f'))



