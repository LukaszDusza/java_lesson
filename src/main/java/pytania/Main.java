package pytania;


    class pytanie1 {
        // co to są typy proste i typy referencyjne.

        //typy proste czyli prymitywne przechowują tylko surowe dane np. liczby lub znaki.
        //natomiast typy referencyjne przechowują swego rodzaju wskaźniki na obiekty lub wartość null.
    }

class pytanie2 {
    //Co to jest leniwe (lazy loading) i zachłanne ładowanie danych (eager loading)?

    // Lazy loading to wzorzec projektowy mający na celu odroczenie inicjalizacji obiektów najpóźniej jak sie da.
    // wlasciewie wykorzystany poprawia wydajnosc aplikacji.

    //Eager loading jest przeciwieństwem leazy loading. Zachłanne pobieranie danych.

//        @Entity
//        @Table(name = "USER")
//        public class UserLazy implements Serializable {
//
//            @Id
//            @GeneratedValue
//            @Column(name = "USER_ID")
//            private Long userId;
//
//            @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//            private Set<OrderDetail> orderDetail = new HashSet();
//
//            // standard setters and getters
//            // also override equals and hashcode

    }

        class pytanie3 {
        //Co to jest Autoboxing and Unboxing?
        byte b1 = 10;
            Byte b2 = new Byte((byte) 10); //bez autoboxingu
            Byte b3 = 10; //autoboxing
            int b4 = new Integer(1); //unboxing
        }

        class pytanie4{
        //Co to są obiekty immutable?
            // Obiekty immutable, czyli niemodyfikowalne, to obiekty,
            // które po utworzeniu nie mogą już zmienić swojego stanu.
            // W efekcie tego każda ich modyfikacja wiąże się z utworzeniem nowego obiektu.
            // Najbardziej znaną klasą niemodyfikowalną jest standardowy String.
        }

        class pytanie5 {
        //co to jest serializacja?
            //serializacja to zmiana obiektow np. w strumien danych z zachowaniem ich aktualnego stanu.
            //deserializacja to proces odtworzenia obiektu do pierwotnego stanu.
        }

        class pytanie6 {
          //mechanizm refleksji polegena na modyfikacji programu po jego kompilacji.
            //dzieki refleksji mozna zarzadzac kodem programu prawie tak latwo jakby to byly dane.
        }

        class pytanie7 {
         //   Czym różnią się wyjątki oznaczone (checked) od nieoznaczonych (unchecked exceptions)?
        //grafika .png
        public void method2() {
            try {
                method1();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void method1() throws Exception{}
        }

        class pytanie8 {
         //   Co to jest enum?
            enum EnumType {
                T1, T2, T3;
         }
         EnumType enumType = EnumType.T1;
        }

        class pytanie9 {
         //   Czy klasa może dziedziczyć po kilku interfejsach?
            //Java z zasady nie wspiera wielodziedziczenia (jako wyjątek można uznać interfejsy z default methods).
            // Jedna klasa może dziedziczyć tylko po jednej klasie rodzica.
            //Klasy nie dziedziczą po interfejsach, a je implementują.
            // Jedna klasa może implementować wiele interfejsów.
            //Jeden interfejs może dziedziczyć po kilku innych.

            interface Interface1 {}
            interface Interface2 {}

            interface Interface3 extends Interface1, Interface2 {}
            class Class1 {}
            class Class2 extends Class1 implements Interface1, Interface2 {}
        }

        class pytanie10 {
        //    Jak pobrać pojedynczy znak z obiektu String?

            String str = "Java";
            char actV = str.charAt(1);
            char expV = 'a';
        }

        class pytanie11 {
         //   Jak wywołać metodę w klasie podrzędnej z klasy nadrzędnej?

            class Class1 {
                void metoda1() {}
            }

            class Class2 extends Class1 {
                public Class2() {
                    super();
                }

                public void metoda() {
                    super.metoda1();
                }
            }
        }


        class pytanie12 {
        //Czym się różni lista (List) od zbioru (Set)?
            //  Lista (java.util.List) reprezentuje uporządkowaną listę elementów i może zawierać duplikaty.
            // Dodatkowo przechowuje kolejność dodawania danych.

            //  Zbiór (java.util.Set) reprezentuje zbiór unikatowych elementów, natomiast przechowywana kolejność
            // jest zależna od konkretnej implementacji zbioru.
        }

        class pytanie13 {
         //   Na czym polega mechanizm konkatenacji stringa?
        }

        class pytanie14 {
        //co to jest rekurencja.
     //   inaczej Rekursja - polega na odwoływaniu sie metody do samej siewbie;
            void r(int i) {
                if(i > 0) {
                    System.out.println(i);
                    r(--i);
                }
            }
        }

        class pytanie15 {
            //        16 O czym mówią zasady SOLID?
            //        16.1 Single responsibility principle (Zasada jednej odpowiedzialności)
//        16.2 Open/closed principle (Zasada otwarte-zamknięte)
//        16.3 Liskov substitution principle (Zasada podstawienia Liskov)
//        16.4 Interface segregation principle (Zasada segregacji interfejsów)
//        16.5 Dependency inversion principle (Zasada odwrócenia zależności)

            //   SOLID jest to mnemonik opisujący pięć podstawowych założeń programowania obiektowego.

            //  Single responsibility principle (Zasada jednej odpowiedzialności)
            //  Dana klasa powinna mieć tylko jedną odpowiedzialność.

            //  Open/closed principle (Zasada otwarte-zamknięte)
            //  Zmiana wymagań powinna skutkować dodaniem nowego kodu rozszerzającego poprzedni, a nie modyfikacją działającego już kodu.

            //  Liskov substitution principle (Zasada podstawienia Liskov)
            //  Funkcje przyjmujące jako argument klasy bazowe powinny być w stanie obsłużyć również obiekty klas pochodnych.

            //  Interface segregation principle (Zasada segregacji interfejsów)
            //  Lepiej przygotować kilka specyficznych, dedykowanych interfejsów, niż jeden zbiorczy.

            //  Dependency inversion principle (Zasada odwrócenia zależności)
            //  Moduły wyższego poziomu nie powinny być zależne od tych z niższego poziomu.
        }

        class pytanie16 {
            //        17 Co to jest mock?
            //Mock  to swego rodzaju atrapa obiektu, wykorzystywana do symulowania zachowania rzeczywistego obiektu.
            // Mocki wykorzystywane są zazwyczaj podczas testów. Przy ich pomocy można zasymulować konkretny przypadek testowy.
        }

        class pytanie17 {
            // Ciągła integracja polega na rozwijaniu oprogramowania
            // z częstym i regularnym dołączaniem bieżących zmian do głównego kodu aplikacji.
            // Dzięki wykorzystaniu ciągłej integracji zmniejsza się koszty i potencjalne ryzyko łączenia prac wykonywanych przez
            // różne osoby. Przekłada się to również na wcześniejsze wykrycie potencjalnych błędów.
           }

           class pytanie18 {
               //  TDD, czyli Test-driven development to technika tworzenia oprogramowania oparta o testy. Metodyka ta polega na wielokrotnym powtarzaniu poniższych kroków:

               //   Przygotowanie automatycznego testu sprawdzającego daną funkcjonalność. Ponieważ funkcjonalność jeszcze nie istnieje, test nie powinien się powieść.
               //  Podstawowa implementacja funkcjonalności, tak by spełnić warunki założone w teście.
               //   Refaktoryzacja kodu, żeby spełniał oczekiwane standardy z jednoczesną weryfikacją, czy warunki testowe są dalej spełnione.
               // Powyższe trzy kroki często nazywane są również: red, green, refactor.
           }

           class pytanie19 {
               //        20 Jakie znasz poziomy testów?
               //       Testy jednostkowe
               //       Testy integracyjne
               //       Testy akceptacyjne

               //   Testy jednostkowe
               //   Weryfikacja poprawności działania pojedynczego elementu aplikacji.
               // Do testów jednostkowych można wykorzystać np. bibliotekę JUnit.

               //  Testy integracyjne
               //  Weryfikacja działania połączonych elementów aplikacji.

               //          Testy akceptacyjne
               //  Celem testów akceptacyjnych nie jest już wykrycie błędów,
               // a jedynie potwierdzenie jakości oprogramowania.
               // Tego rodzaju testy są bardzo często wykonywane z udziałem klienta odbierającego produkt.
           }


           class pytanie20 {
           //    Jakie znasz wzorce projektowe?
               // - adapter
               // - builder
               // - factory
               // - fly weight - pyłek
               // - observer
               // - singleton
               // - memento  - pamiątka
               // - decorator
               // - chain if responsibility - łańcuch odpowiedzialności
               // - template method - metoda szablonowa
               // - fasada
               // - strategy - strategia
               // - command - komenda
               // - iterator

               // wzroce kreacyjne: budowniczy, fabryka, singleton
               // wzorce strukturalne: adapter, dekorator, fasada
               // wzorce czynnościowe: łańcuch odpowiedzialności, iterator, stategia.
           }

           class pytanie21 {
               //        22 Co to jest wątek (thread)?
// Wątek pozwala uruchomić fragmenty kodu aplikacji współbieżnie.
// Dzięki wątkom można np. część operacji wykonywać asynchronicznie, nie blokując głównego przepływu aplikacji lub skończyć pracę szybciej, wykorzystując kilka wątków jednocześnie.

//                  new Thread(new Runnable) {
//                  @Override
//                 public void run() {
//                     System.out.println(Thread.currentThread().getId());
//                 }
//               }).start();
//               System.out.println(Thread.currentThread().getId());
           }








