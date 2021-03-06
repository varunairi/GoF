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

But you must now see that it requires all  decorating classes to also implement same interface as the core functionality. So any addition of functionality to the core needs to be made into interface and all the applicable decorators as well. So please dont use this pattern for cross cutting concerns etc 

 

## Visitor
Visitor allows objects to "welcome" additional functionality which may not be core to that object (like tax calculation on a grocery item). This allows the Core object to stay true to SRP and the Visitor's Concrete class takes a reference of core and performs operation on it. 
Some Considerations: 

 -  It does add Circular Dependency
 -  It also means every time a new type of GroceryItem comes, you'd have to write a new method in Concrete Visitor to be able to visit that object. 


## Strategy 
Strategy allows to plugin a custom logic in the behavior. In traditinoal pattern, the caller / client determines which behavior they need the algorithm to act on. 

With Lambdas though it is much simpler to pass behavior as is given in the example as well


## Command 
Command allows to segregate each behavior into their own object. 
- So the "Reciever" supports all kind of behaviors.
- Then you have command objects that invoke one operation on the reciever each
   - The Command Class takes Reciever as input
- The Invoker facilitates the command to go through (by taking command object as input)
This allows you to segregate commands on a reciever and lets you add behavior in invoker as well (like Audit log etc)

## Builder 
Builder is used to construct an object that is made up of different parts/steps. There is a builder interface that can be extended and the concrete classes work on a "product" and enrich it with data per the logic expected from that class. 

The orchestration of all the steps is done through a "Director" 

The Test Driver class in the example chooses the builder, passes on to the director and then gets back the built product from that builder. 


## COR 
Chain of responsibility allows you to process a request by a chain of filters by one and only one of those filters. IF the filter is unable to process, it will pass it on to next one. In JAva 8, you can visualize a chain of Consumers and can pass them to make a chain . 
## Bridge
This is used when you have a requirement where a key attribute can change independently . For example, instead of creating a Vehicle --> Car, Bike --> AutoCar, Manual Car , Auto Bike, Manual Bike heirarchy. You can have a separate Transmission abstraction that can be part of Vehicle as an attribute. So if tomorrow, a "CVT" or "Dual" transmission comes in , there is no impact to Vehicl heirarchy.


The Test Driver class in the example chooses the builder, passes on to the director and then gets back the built product from that builder. 