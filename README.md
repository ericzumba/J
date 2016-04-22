## J

An easier way to write json strings inside java 8

## Code Example

### Nested object

```java
import static com.ericzumba.J.o;

o("a", 
  o("b", "c"))
.j();
```

stands for 
```json
{"a": 
  {"b": "c"}
}
```
### List

```java
import static com.ericzumba.J.o;

o("a", 
  asList("b", "c"))
.j();
```

stands for 
```json
{"a": 
  ["b", "c"]
}
```
