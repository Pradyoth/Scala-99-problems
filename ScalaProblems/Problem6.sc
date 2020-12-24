object P06{

  def isPalindrome[A](ls:List[A]):Boolean =
    ls==ls.reverse

}

P06.isPalindrome(List(1,2,2,1))
