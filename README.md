# Java Basic

## Java Collections Framework
[Oracle tutorial](https://docs.oracle.com/javase/tutorial/collections/TOC.html)
[beginnersbook.com](http://beginnersbook.com/java-collections-tutorials/)
Generics:[elmélet](https://docs.oracle.com/javase/tutorial/extra/generics/index.html)

### Collection 
    Objektumok csoportja
[Tutorial](https://docs.oracle.com/javase/tutorial/collections/interfaces/collection.html) 
[API](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html)
    
#### [SET]()
[HashSet](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html)

## Java IO [Oracle tutorial](http://docs.oracle.com/javase/tutorial/essential/io/index.html)
### Byte Streams [Oracle tutorial](http://docs.oracle.com/javase/tutorial/essential/io/bytestreams.html)
    Raw binary adatok kezelése.
#### InputStream [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)
    Bemeneti adat folyam.
#### OutputStream [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)
    Kimeneti adat folyam.
#### FileInputStream [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/FileInputStream.html)
    File input adat folyam.
#### FileOutputStream [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/FileOutputStream.html)
    File output adat folyam.

### Character Streams [Oracle tutorial](http://docs.oracle.com/javase/tutorial/essential/io/charstreams.html)
    handle I/O of character data, automatically handling translation to and from the local character set.
#### Reader [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)
    Bemeneti karakter alapú adat forrás.
#### Writer [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)
    Kimeneti karakter alapú adat forrás.
#### FileReader [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/FileReader.html)
    Karakteres file input.
#### FileWriter [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/FileWriter.html)
    Karakteres file output.

### Buffered Streams [Oracle tutorial](http://docs.oracle.com/javase/tutorial/essential/io/buffers.html)
    optimize input and output by reducing the number of calls to the native API.
#### BufferedInputStream [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedInputStream.html)
#### BufferedOutputStream [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedOutputStream.html)
#### BufferedReader [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html)
#### BufferedWriter [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedWriter.html)

### Scanning and Formatting [Oracle tutorial](http://docs.oracle.com/javase/tutorial/essential/io/scanfor.html)
    allows a program to read and write formatted text.
### I/O from the Command Line [Oracle tutorial](http://docs.oracle.com/javase/tutorial/essential/io/cl.html)
    describes the Standard Streams and the Console object.
#### Console [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/Console.html)
### Data Streams [Oracle tutorial](http://docs.oracle.com/javase/tutorial/essential/io/datastreams.html)
    handle binary I/O of primitive data type and String values.
#### DataInput [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/DataInput.html)
#### DataOutput [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/DataOutput.html)
#### DataInputStream [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/DataInputStream.html)
#### DataOutputStream [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/DataOutputStream.html)
### Object Streams [Oracle tutorial](http://docs.oracle.com/javase/tutorial/essential/io/objectstreams.html)
    handle binary I/O of objects.
#### ObjectInput [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/ObjectInput.html)
#### ObjectOutput [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/ObjectOutput.html)
#### ObjectInputStream [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/ObjectInputStream.html)
#### ObjectOutputStream [Java API](https://docs.oracle.com/javase/8/docs/api/java/io/ObjectOutputStream.html)



## Java Logging


## Java Concurrency [Oracle tutorial](https://docs.oracle.com/javase/tutorial/essential/concurrency/index.html)

### Thread Objects [Oracle tutorial](https://docs.oracle.com/javase/tutorial/essential/concurrency/threads.html),[Life cycle](http://www.javatpoint.com/life-cycle-of-a-thread)
#### Thread [Java API](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)
    Szál osztály
#### Runnable [Java Api](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)
    Szál interface
### Synchronization [Oracle tutorial](https://docs.oracle.com/javase/tutorial/essential/concurrency/sync.html)
    Zárak alkalmazása, konkurens hozzáférések kezelésére.
### High Level Concurrency Objects [Oracle tutorial](https://docs.oracle.com/javase/tutorial/essential/concurrency/highlevel.html)
    Konkurencia kezelés
##### Lock Objects [Java API package](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/package-summary.html), [Oracle tutorial](https://docs.oracle.com/javase/tutorial/essential/concurrency/newlocks.html)
###### Lock [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/Lock.html)
    Általános belső zár
###### Condition [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/Condition.html),[Example - Java Concurrency in Practice](http://jcip.net/listings/ConditionBoundedBuffer.java)
    Általános várakozási sor
###### ReadWriteLock [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html)
    Több olvasó, egy író zár.
###### ReentrantLock [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReentrantLock.html)
    Ugyan az mint a syncronized.
###### ReentrantReadWriteLock [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReentrantReadWriteLock.html)
    Több olvasó, egy író zár, írás közben nem lehet olvasni.

#### Concurrent Collections [Oracle tutorial](https://docs.oracle.com/javase/tutorial/essential/concurrency/collections.html), [Java API package](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/package-summary.html)
##### BlockingQueue [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/BlockingQueue.html)
##### ArrayBlockingQueue [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ArrayBlockingQueue.html)
##### DelayQueue [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/DelayQueue.html)
##### LinkedBlockingDeque [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/LinkedBlockingDeque.html)
##### LinkedBlockingQueue [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/LinkedBlockingQueue.html)
##### LinkedTransferQueue [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/LinkedTransferQueue.html)
##### PriorityBlockingQueue [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/PriorityBlockingQueue.html)
##### SynchronousQueue [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/SynchronousQueue.html)

##### [ConcurrentMap](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentMap.html)

#### Atomic Varables [Oracle tutorial](https://docs.oracle.com/javase/tutorial/essential/concurrency/atomicvars.html)
#### Executors [Oracle tutorial](https://docs.oracle.com/javase/tutorial/essential/concurrency/executors.html)
##### Executor [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Executor.html)
##### ExecutorService [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)
##### Future [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Future.html)
##### ScheduledExecutorService [Java API](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ScheduledExecutorService.html)

## Networking

## Unit testing
