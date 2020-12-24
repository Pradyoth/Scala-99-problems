def isPrime(number:Int): Boolean ={


  if (number==1)
    false

  else if (number==2)
    true

  else
    !(2 to number -1).exists(x => number %x==0)

}

isPrime(12)

