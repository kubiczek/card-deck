# Build the application

It is recommended to build the application with gradle tool by executing `./gradlew bootRepackage` command.

# Run the application

You can run the JAR file: `java -jar build/libs/card-deck-1.0-SNAPSHOT.jar`

The application prints to stdout initial deck of cards and the deck after shuffling.

```
$ java -jar build/libs/card-deck-1.0-SNAPSHOT.jar

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.4.1.RELEASE)

2016-11-15 00:55:27.437  INFO 9404 --- [           main] com.kubiczek.card.Application            : Starting Application on WN-MKUBI-02 with PID 9404 (D:\workspace-tutorials\card-deck\build\libs\card-deck-1.0-SNAPSHOT.jar started by mkubiczek in D:\workspace-tutorials\card-deck)
2016-11-15 00:55:27.443  INFO 9404 --- [           main] com.kubiczek.card.Application            : No active profile set, falling back to default profiles: default
2016-11-15 00:55:27.499  INFO 9404 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@19bb367: startup date [Tue Nov 15 00:55:27 GMT 2016]; root of context hierarchy
2016-11-15 00:55:28.236  INFO 9404 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2016-11-15 00:55:28.248  INFO 9404 --- [           main] com.kubiczek.card.Application            : Deck of cards: Deck{cards=[Card{rank=ACE, suit=CLUBS}, Card{rank=TWO, suit=CLUBS}, Card{rank=THREE, suit=CLUBS}, Card{rank=FOUR, suit=CLUBS}, Card{rank=FIVE, suit=CLUBS}, Card{rank=SIX, suit=CLUBS}, Card{rank=SEVEN, suit=CLUBS}, Card{rank=EIGHT, suit=CLUBS}, Card{rank=NINE, suit=CLUBS}, Card{rank=TEN, suit=CLUBS}, Card{rank=JACK, suit=CLUBS}, Card{rank=QUEEN, suit=CLUBS}, Card{rank=KING, suit=CLUBS}, Card{rank=ACE, suit=DIAMONDS}, Card{rank=TWO, suit=DIAMONDS}, Card{rank=THREE, suit=DIAMONDS}, Card{rank=FOUR, suit=DIAMONDS}, Card{rank=FIVE, suit=DIAMONDS}, Card{rank=SIX, suit=DIAMONDS}, Card{rank=SEVEN, suit=DIAMONDS}, Card{rank=EIGHT, suit=DIAMONDS}, Card{rank=NINE, suit=DIAMONDS}, Card{rank=TEN, suit=DIAMONDS}, Card{rank=JACK, suit=DIAMONDS}, Card{rank=QUEEN, suit=DIAMONDS}, Card{rank=KING, suit=DIAMONDS}, Card{rank=ACE, suit=HEARTS}, Card{rank=TWO, suit=HEARTS}, Card{rank=THREE, suit=HEARTS}, Card{rank=FOUR, suit=HEARTS}, Card{rank=FIVE, suit=HEARTS}, Card{rank=SIX, suit=HEARTS}, Card{rank=SEVEN, suit=HEARTS}, Card{rank=EIGHT, suit=HEARTS}, Card{rank=NINE, suit=HEARTS}, Card{rank=TEN, suit=HEARTS}, Card{rank=JACK, suit=HEARTS}, Card{rank=QUEEN, suit=HEARTS}, Card{rank=KING, suit=HEARTS}, Card{rank=ACE, suit=SPADES}, Card{rank=TWO, suit=SPADES}, Card{rank=THREE, suit=SPADES}, Card{rank=FOUR, suit=SPADES}, Card{rank=FIVE, suit=SPADES}, Card{rank=SIX, suit=SPADES}, Card{rank=SEVEN, suit=SPADES}, Card{rank=EIGHT, suit=SPADES}, Card{rank=NINE, suit=SPADES}, Card{rank=TEN, suit=SPADES}, Card{rank=JACK, suit=SPADES}, Card{rank=QUEEN, suit=SPADES}, Card{rank=KING, suit=SPADES}]}
2016-11-15 00:55:28.250  INFO 9404 --- [           main] com.kubiczek.card.Application            : Shuffling...
2016-11-15 00:55:28.253  INFO 9404 --- [           main] com.kubiczek.card.Application            : Deck of cards: Deck{cards=[Card{rank=SEVEN, suit=CLUBS}, Card{rank=THREE, suit=HEARTS}, Card{rank=THREE, suit=SPADES}, Card{rank=THREE, suit=DIAMONDS}, Card{rank=FIVE, suit=SPADES}, Card{rank=EIGHT, suit=SPADES}, Card{rank=JACK, suit=CLUBS}, Card{rank=SEVEN, suit=DIAMONDS}, Card{rank=SIX, suit=SPADES}, Card{rank=QUEEN, suit=CLUBS}, Card{rank=NINE, suit=DIAMONDS}, Card{rank=FIVE, suit=HEARTS}, Card{rank=FIVE, suit=CLUBS}, Card{rank=TEN, suit=SPADES}, Card{rank=NINE, suit=HEARTS}, Card{rank=EIGHT, suit=DIAMONDS}, Card{rank=EIGHT, suit=CLUBS}, Card{rank=ACE, suit=CLUBS}, Card{rank=SIX, suit=CLUBS}, Card{rank=ACE, suit=SPADES}, Card{rank=QUEEN, suit=SPADES}, Card{rank=JACK, suit=DIAMONDS}, Card{rank=SIX, suit=DIAMONDS}, Card{rank=JACK, suit=HEARTS}, Card{rank=NINE, suit=SPADES}, Card{rank=SEVEN, suit=HEARTS}, Card{rank=NINE, suit=CLUBS}, Card{rank=FOUR, suit=DIAMONDS}, Card{rank=FOUR, suit=CLUBS}, Card{rank=TWO, suit=CLUBS}, Card{rank=THREE, suit=CLUBS}, Card{rank=KING, suit=DIAMONDS}, Card{rank=TEN, suit=DIAMONDS}, Card{rank=TEN, suit=CLUBS}, Card{rank=ACE, suit=DIAMONDS}, Card{rank=QUEEN, suit=HEARTS}, Card{rank=EIGHT, suit=HEARTS}, Card{rank=TEN, suit=HEARTS}, Card{rank=FOUR, suit=SPADES}, Card{rank=ACE, suit=HEARTS}, Card{rank=JACK, suit=SPADES}, Card{rank=QUEEN, suit=DIAMONDS}, Card{rank=FIVE, suit=DIAMONDS}, Card{rank=KING, suit=CLUBS}, Card{rank=TWO, suit=SPADES}, Card{rank=TWO, suit=DIAMONDS}, Card{rank=SEVEN, suit=SPADES}, Card{rank=FOUR, suit=HEARTS}, Card{rank=TWO, suit=HEARTS}, Card{rank=SIX, suit=HEARTS}, Card{rank=KING, suit=HEARTS}, Card{rank=KING, suit=SPADES}]}
2016-11-15 00:55:28.256  INFO 9404 --- [           main] com.kubiczek.card.Application            : Started Application in 1.222 seconds (JVM running for 1.602)
2016-11-15 00:55:28.256  INFO 9404 --- [       Thread-1] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@19bb367: startup date [Tue Nov 15 00:55:27 GMT 2016]; root of context hierarchy
2016-11-15 00:55:28.257  INFO 9404 --- [       Thread-1] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown
```