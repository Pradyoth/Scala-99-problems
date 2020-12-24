object P22{

  def rangeRecursive(start:Int,end:Int): List[Int] ={

    if (start > end)  Nil


    else start :: rangeRecursive(start+1,end)



  }
}

P22.rangeRecursive(4,9)
