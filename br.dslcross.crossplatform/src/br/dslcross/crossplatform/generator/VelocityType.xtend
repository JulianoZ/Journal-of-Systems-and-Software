package br.dslcross.crossplatform.generator

import br.dslcross.crossplatform.crossPlatform.Type
import br.dslcross.crossplatform.crossPlatform.Entity
import br.dslcross.crossplatform.crossPlatform.Attribute

class VelocityType {

	Type attType

	new(Type t) {
		attType = t
	}

	def getAttributes() {

		switch attType {
			Entity: return attType.features.filter(Attribute)
			
		}
		return null
	}
	
	def getName(){
		return attType.name
	}
	
	
	


}
