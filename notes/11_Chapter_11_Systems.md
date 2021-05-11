# Chapter 11: Systems

`Complexity kills. It sucks the life out of developers,
it makes products difficult to plan, build, and test.`

—Ray Ozzie, CTO, Microsoft Corporation

## How would you build a city?
- cities have teams of people who manage particular parts of the city, the water systems, power systems, traffic, law enforcement, building codes, and so forth
- Although software teams are often organized like that too, the systems they work on 
  often don’t have the same separation of concerns and levels of abstraction.

## Separate constructing a System from Using it
Software systems should separate the startup process, when the application objects are
constructed and the dependencies are “wired” together, from the runtime logic that takes
over after startup.
- Lazy initialization
- Separation of concerns
- Test double
- Mock object

## Separation of Main
move all aspects of construction to main, or modules called by main, and to design the rest of the system assuming that all objects have been constructed and wired up appropriately

## Factories
To create instances of models use ABSTRACT FACTORY pattern . In this case you can easily swap factories in your test.

## Dependency injection
- Separating construction from use
- Move responsibility of construction to another authoritative mechanism

### Lazy initialization
Don't create instance of object unless it's used

## Scaling up
It is a myth that we can get systems "right the first time."

We implement only today's stories. Then refactor and expand the system to implement new stories tomorrow.
This is the essence of iterative and incremental agility.

TDD + Refactoring + Clean code

## Cross-cutting concerns
Research about AOP (aspect-oriented programming)
Laravel environment might be using this approach

## Java Proxies
Annotation processors might be using this approach, take a look at mockfit

## Pure Java AOP Framework
- Android room library might be using this approach check it out
- Decorator pattern

## AspectJ aspects
An extension language of Java to provide aspect programming

## Test drive the system architecture
- It is not necessary to do a Big Design Up Front. You can start your architecture so simple to meet user stories and evolve gradually
- Even well-designed apis can be over-kill when they aren't really needed

## Optimize decision making
- **Modularity** and **Separation of concerns** make decentralized management and decision making possible.
- You always have to make a choice, even if you’re not 100% sure if it’s the right one. It’s always better to take your best  guess, and see how things work out, rather than spend endless hours debating one choice or another. (Analysis paralysis - Head first OOAD)

## Use standards wisely, when they add demonstratble value
You might have different frameworks or standards to do a job. In web development eg. Laravel, Django, Flask, Ktor, Asp.net, …

If one minimal framework suffices your customer needs, don't obsessed with big luxiory tools that will only delay delivery

## Systems need domain-specific languages
Good DSL minimizes the "communication gap" between a domain concept and the code. Eg. Gradle, SQL, Html, …
