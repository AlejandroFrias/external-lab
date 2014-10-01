package calculator.parser

import org.scalatest._

import calculator.ir._
import calculator.parser._
import edu.hmc.langtools._

class CalcParserTests extends FunSpec with LangParseMatchers[AST] {

  override val parser = CalcParser.apply _
  
  describe("A number") {

    it("can be a single digit") {
      program("1") should parseAs ( Num(1) )
    }
    
    it ("can be multiple digits") {
      program("10") should parseAs ( Num(10) )
      program("121") should parseAs ( Num(121) )
    }
    
    it ("can be a negative number") {
      program("-10") should parseAs ( Num(-10) )
    }
    
    it ("cannot be floating-point number") {
      program("1.1") should not (parse)
      program(" .3") should not (parse)
    }

  }
  
  describe("Addition") {

    it("can add two numbers") {
      program("1+1") should parseAs ( Plus(Num(1), Num(1)) )
    }
    
    it("can be chained (and is left-associative)") {
      program("1 + 2 + 100") should parseAs ( Plus(Plus(Num(1), Num(2)), Num(100)) )
    }

  }
}