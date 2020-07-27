# Design Patterns

The following are some examples of commonly used design patterns to give a quick reference. 

***

## Observer Pattern
It is used when one object's change of state need to be broadcast to an interested set of observer objects.  This pattern allows the subject of observation to accept "observers" and whenever there is a change in state, it notifies all of them. 
The example that I have shows a subject that publishes a state change with new and old values to the observers and they can take action on them. 

Some considerations are: 

 -  It requires the subject to be thread safe
 -  Also the obrvers may only be interested in certain state changes and not all, so you may have to make the example differently (with a central registry) 
 -  Java already provides Observer class and Observable Interface. 


## Decorator 
This pattern allows to add "additional" behavior on an existing functioanlity and is applied at the build time of an object. 

In the following example, we need a core functionality to also send to Log, and sometimes to Kafka too. All of this behavior is an "add on" and can be decided to associate with the underlying core object at the time of creation. 

 

## Visitor
Visitor allows objects to "welcome" additional functionality which may not be core to that object (like tax calculation on a grocery item). This allows the Core object to stay true to SRP and the Visitor's Concrete class takes a reference of core and performs operation on it. 
Some Considerations: 

 -  It does add Circular Dependency
 -  It also means every time a new type of GroceryItem comes, you'd have to write a new method in Concrete Visitor to be able to visit that object. 



