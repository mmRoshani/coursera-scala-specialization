@main def sqrt: Unit =
  println(sqrt(25))

def sqrt(x: Double): Double = 
  def sqrtIter(guess: Double): Double = 
    if isGoodEnough(guess) then guess
    else sqrtIter(improve(guess))

  def improve(guess: Double) = 
    (guess + x / guess) / 2

  def isGoodEnough(guess: Double) = 
    (guess * guess - x).abs < 0.001

  sqrtIter(1.0)