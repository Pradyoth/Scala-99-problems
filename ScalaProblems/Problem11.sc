val ls = List(List(1),List(4,4))


val result = ls map (x =>{
  if (x.length ==1) x(0)
  else
     (x.length , x(0))
})

println(result)
