# Module 3 – Spring Data JPA with Hibernate

## Hands-on 1: Introduction to HQL and JPQL

### Objective

- Understand Hibernate Query Language (HQL)
- Understand Java Persistence Query Language (JPQL)
- Learn the differences between HQL and JPQL
- Learn why object-oriented query languages are preferred over SQL in JPA applications

---

## What is HQL?

HQL (Hibernate Query Language) is the query language provided by Hibernate.

- Uses entity names instead of table names.
- Uses entity fields instead of database columns.
- Supports SELECT, UPDATE, DELETE and INSERT operations.
- Database independent.

Example:

```java
FROM Employee
```

```java
FROM Employee WHERE salary > 50000
```

---

## What is JPQL?

JPQL (Java Persistence Query Language) is the standard query language defined by JPA.

- Uses entity classes and attributes.
- Database independent.
- Supported by all JPA providers.
- Supports SELECT, UPDATE and DELETE.
- Does not support INSERT.

Example:

```java
SELECT e FROM Employee e
```

```java
SELECT e FROM Employee e WHERE e.salary > 50000
```

---

## Difference between SQL and HQL

| SQL | HQL |
|-----|-----|
| Uses table names | Uses entity names |
| Uses column names | Uses Java properties |
| Database specific | Database independent |

Example SQL

```sql
SELECT * FROM employee;
```

Equivalent HQL

```java
FROM Employee
```

---

## Difference between HQL and JPQL

| HQL | JPQL |
|-----|------|
| Hibernate specific | JPA standard |
| Supports INSERT | Does not support INSERT |
| Superset of JPQL | Subset of HQL |
| Supports Hibernate-specific features | Portable across JPA providers |

---

## Advantages

- Database independent
- Object-oriented queries
- Easier maintenance
- Supports joins, aggregate functions, ordering and grouping
- Uses entity classes instead of database tables

---

## Conclusion

HQL and JPQL simplify database operations by allowing developers to write queries using Java entities instead of database tables. JPQL is standardized by JPA, whereas HQL is Hibernate-specific and provides additional features such as INSERT statements.