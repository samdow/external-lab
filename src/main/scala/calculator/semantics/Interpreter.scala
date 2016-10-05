package calculator

import calculator.ir._

package object semantics {
  def eval(expr: Expr): Int = expr match {
    case Num(i) ⇒ i
    case Plus(left, right) ⇒ eval(left) + eval(right)
    case Sub(left, right) => eval(left) - eval(right)
    case Mul(left, right) => eval(left) * eval(right)
    case Div(left, right) => eval(left) / eval(right)
    case Paren(expr) => eval(expr)
  }
}