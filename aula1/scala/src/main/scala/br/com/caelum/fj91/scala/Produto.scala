package br.com.caelum.fj91.scala
import scala.beans._

class Produto(@BeanProperty val nome:String, @BeanProperty var quantidade:Int, @BeanProperty var preco:Double){

	override def toString = {
	    nome + " - " + preco
	}
}