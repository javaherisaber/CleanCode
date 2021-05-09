# Chapter 8: Boundaries [[Slide](../slides/08_Chapter_8_Boundaries.pptx)]

We seldom control all the software in our systems. Sometimes we buy third-party packages
or use open source. Other times we depend on teams in our own company to produce
components or subsystems for us.

## Using Third-Party Code
- Interface providers strive for broad applicability, while interface users want it to be focused on their needs
- Don’t pass map outside of system (eg. Public API) boundaries

## Exploring and learning boundaries
Learning test:
We call third-party API, as we expect to use it in our application

## Learning log4j
We write test to see how it works

## Learning tests are better than free
Learning tests helps us to find boundary tests and ease our migrations if there is any breaking change in new releases

## Clean boundaries
Change is inevitable in software

Code at the boundaries needs clear separation and tests that define expectations
