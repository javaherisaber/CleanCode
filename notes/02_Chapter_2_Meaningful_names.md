# Chapter 2: Meaningful names [[Slide](../slides/02_Chapter_2_Meaningful_names.pptx)]

## Use Intention-Revealing Names
Using `d` instead of `elapsedTimeInDays`.

## Avoid Disinformation
- Using names like `hp`, `aix` where it has different meaning in different contexts.
- Using `AccountList` for group of accounts where there is no list

## Make Meaningful Distinctions
- Using `a1` and `a2` instead of `source` and `destination`.
- what's the difference between `TheCustomer`, `CustomerData`, `CustomerInfo` and `Customer`

## Use Pronounceable Names
Don't compact names for sake of smaller words, eg. `pref`, `mnger`, `genymdhms`.

## Use Searchable Names
Using constants and complete names make it easy to find them with search, eg. `WORK_DAYS_PER_WEEK`

## Avoid Encodings
### Hungarian Notation
In the modern IDE's there is no need to prefix with HN, eg. `frmReserve`, `tblStudent`.

### Member Prefixes
Don't use stupid m prefix for field names, eg. `mLatitude`, `mContext`

### Interfaces and Implementations
Prefer to suffix Implementation class, rather than Interface class
eg. `ShapeFactory` for the interface and `ShapeFactoryImpl` for the implementation.

## Avoid Mental Mapping
Readers shouldn’t have to mentally translate your names into other names they already know.

## Class Names
noun or noun phrases

## Method Names
- methods should have verb or phrase names
    eg. `deletePage()`, `save()`, `isEven()`, `setPoint()`, `hasElement()`
- prefer factory methods for multiple constructors

## Don’t Be Cute
Using `whack()` instead of `kill()`, `eatMyShorts()` instead of `abort()`, `nukeTable()` instead of `deleteAll()`

## Pick One Word per Concept
eg. `fetch`, `retrieve` and `get`

## Don’t Pun
Avoid using the same word for two purposes. Using the same term for two different ideas
is essentially a pun.
eg. using `add` instead of `insert` for a method which is putting single parameter to a collection is a pun

## Use Solution Domain Names
use computer science (CS) terms, algorithm names, pattern names, math terms

## Use Problem Domain Names
When there is no “programmer-eese” for what you’re doing, use the name from the problem
domain.

## Add Meaningful Context
Separate your concerns using well-named :
- Constant
- Function
- Class
- Namespace
- Package
- Module

When all else fails, then prefixing the name may be necessary as a last resort.

## Don’t Add Gratuitous Context
eg. `GSDAccountAddress`
