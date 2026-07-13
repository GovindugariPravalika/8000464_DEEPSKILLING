# Spring Data JPA with Hibernate - Module 3

## Hands on 6 - Criteria Query

### Objective

Understand the purpose and advantages of Hibernate Criteria Query.

---

## What is Criteria Query?

Criteria Query is a feature provided by JPA/Hibernate that allows developers to build database queries dynamically using Java code instead of writing HQL or SQL strings.

It is mainly used when the search conditions are not fixed and depend on user inputs.

---

## Why do we need Criteria Query?

Consider an online shopping website like Amazon.

A user searches for:

Laptop

The user may apply one or more filters such as:

- Customer Rating
- RAM Size
- Hard Disk Size
- Processor
- Operating System
- CPU Speed
- Weight

Since every user selects different combinations of filters, it is impossible to write a separate HQL query for every combination.

Instead of creating hundreds of HQL queries, Criteria Query builds the WHERE clause dynamically.

---

## Example

User 1 selects:

- RAM = 16 GB
- SSD = 512 GB

Generated WHERE clause:

WHERE ram = 16
AND hard_disk = 512

---

User 2 selects:

- Processor = Intel i7
- Rating >= 4

Generated WHERE clause:

WHERE processor = 'Intel i7'
AND rating >= 4

---

## Advantages of Criteria Query

- Dynamic query generation
- Type-safe queries
- Easy to maintain
- No need to concatenate query strings
- Reduces chances of syntax errors
- Supports complex search filters

---

## Main Classes Used

- EntityManager
- CriteriaBuilder
- CriteriaQuery
- Root
- Predicate
- TypedQuery

---

## Basic Flow

1. Obtain EntityManager.
2. Create CriteriaBuilder.
3. Create CriteriaQuery.
4. Define Root entity.
5. Add required Predicates.
6. Execute the query using TypedQuery.
7. Return the results.

---

## Example Structure

EntityManager
        ↓
CriteriaBuilder
        ↓
CriteriaQuery
        ↓
Root<Entity>
        ↓
Predicates
        ↓
TypedQuery
        ↓
Result List

---

## When to use Criteria Query?

Use Criteria Query whenever search filters are dynamic and depend on user selections.

Examples:

- Product search
- Employee search
- Student search
- Order history
- Advanced filtering
- Reporting applications

---

## Conclusion

Criteria Query provides a flexible and maintainable way to create dynamic database queries in Hibernate. It is preferred over manually constructing HQL queries whenever multiple optional search conditions are involved.