package com.assignments.week1

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0) return 1
    else if(c > r) return 0
    else return pascal(c -1, r -1) + pascal(c, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balance(chars: List[Char], count: Int): Boolean = {
      if (count < 0) return false
      if (chars.isEmpty)  return count == 0
      else {
        chars.head match {
          case '('  => return balance(chars.tail, count + 1)
          case ')'  => return balance(chars.tail, count - 1)
          case  _   => return balance(chars.tail, count)
        }
      }
    }
    return balance(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money > 0){
      if(coins.isEmpty) return 0
      else return countChange(money, coins.tail) + countChange(money - coins.head, coins)
    }else if( money < 0) return 0
    else return 1
  }
}
