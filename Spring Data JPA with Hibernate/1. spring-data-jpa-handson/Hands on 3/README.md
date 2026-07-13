# Exercise 3 - Hibernate Annotation Configuration

## Objective

To understand how Hibernate uses annotations instead of XML configuration for Object Relational Mapping (ORM).

## Topics Covered

### Entity Class

- Represents a database table as a Java class.

### @Entity

- Marks a Java class as a Hibernate Entity.

### @Table

- Maps the entity class to a database table.

### @Id

- Specifies the primary key of the table.

### @Column

- Maps a class field to a table column.

### Hibernate Annotation Configuration

- Configuration is done using annotations instead of XML mapping files.

### Database Operations

The general flow of Hibernate using annotations is:

1. Load Hibernate Configuration
2. Create SessionFactory
3. Open Session
4. Begin Transaction
5. Perform Database Operations
6. Commit Transaction
7. Close Session

## Example Annotations

```java
@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "co_code")
    private String code;

    @Column(name = "co_name")
    private String name;
}
```

## Conclusion

Hibernate Annotation Configuration reduces XML configuration and makes the code cleaner and easier to maintain.

**Note:** This exercise is demonstration-based and does not require additional coding.