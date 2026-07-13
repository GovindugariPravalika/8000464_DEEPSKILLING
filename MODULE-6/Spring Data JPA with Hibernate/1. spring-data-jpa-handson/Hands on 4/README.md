# Exercise 4 - Difference between JPA, Hibernate and Spring Data JPA

## Objective

To understand the relationship and differences between Java Persistence API (JPA), Hibernate, and Spring Data JPA.

---

## Java Persistence API (JPA)

- JPA is a specification for Object Relational Mapping (ORM).
- It defines standard interfaces for database operations.
- JPA itself is not an implementation.

### Advantages

- Standard API
- Database independent
- Easy to switch implementations

---

## Hibernate

- Hibernate is one of the implementations of JPA.
- It is an ORM framework that maps Java objects to database tables.
- It provides additional features beyond JPA.

### Advantages

- Automatic table mapping
- Caching support
- HQL (Hibernate Query Language)
- Database independence

---

## Spring Data JPA

- Spring Data JPA is built on top of JPA.
- It internally uses Hibernate (or another JPA implementation).
- It minimizes boilerplate code by providing repository interfaces.

### Advantages

- Less coding
- Built-in CRUD methods
- Query Method support
- Easy integration with Spring Boot

---

## Comparison

| Feature | JPA | Hibernate | Spring Data JPA |
|----------|-----|-----------|-----------------|
| Type | Specification | Framework | Spring Module |
| Implementation | No | Yes | Uses JPA |
| ORM Support | Standard | Complete | Through Hibernate |
| CRUD Methods | No | Manual | Built-in |
| Boilerplate Code | High | Medium | Very Low |

---

## Relationship

Spring Boot

↓

Spring Data JPA

↓

JPA Specification

↓

Hibernate

↓

MySQL Database

---

## Conclusion

- JPA defines the standard.
- Hibernate implements the standard.
- Spring Data JPA simplifies Hibernate development by reducing boilerplate code.

**Note:** This exercise is theory-based and does not require code implementation.