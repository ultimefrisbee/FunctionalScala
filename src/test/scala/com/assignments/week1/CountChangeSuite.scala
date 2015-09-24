package com.assignments.week1

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalameter._

@RunWith(classOf[JUnitRunner])
class CountChangeSuite extends FunSuite {
  import Main.countChange
  test("countChange: example given in instructions") {
    assert(countChange(4,List(1,2)) === 3)
  }

  test("countChange: sorted CHF") {
    val time = measure {
      assert(countChange(300,List(5,10,20,50,100,200,500)) === 1022)
    }
    println(s"countChange: sorted CHF Total time: $time")
  }

  test("countChange: no pennies") {
    assert(countChange(301,List(5,10,20,50,100,200,500)) === 0)
  }

  test("countChange: unsorted CHF") {
    val time = measure {
      assert(countChange(300,List(500,5,50,100,20,200,10)) === 1022)
    }
    println(s"countChange: unsorted CHF Total time: $time")
  }
}
