import java.util.BitSet;

class bitSet {
    public static void main(String args[]) {
        BitSet players = new BitSet(120);
        players.set(0,63,true);
        System.out.println(players.get(3));//get maens to its'value to 1
        players.clear(4);//clear means to set 4th index value is 0
        players.set(4);//to set its value as one.
        System.out.println(players.get(4));
        System.out.println(players.size());//it teturns the size of players
        System.out.println(players.length());//it returns the logical size of bitset
        System.out.println(players.hashCode());//it returns the hashcode
        System.out.println(players.cardinality());//this method returns the no.of bits set to true in bitset
        System.out.println(players.isEmpty());//it returns true if the current bitset does not contains any bit which set to true
        System.out.println(players.nextClearBit(24));//it returns the index of first bit which is set to false that occurs on after the specified index
        System.out.println(players.nextSetBit(2));//it returns the index of first bit which is set to true
        System.out.println(players.toString());//it converts bitset into String
        System.out.println(players.intersects(players));
        System.out.println(players.toLongArray());
        System.out.println(players.stream());//it returns a stream of indices for which this bitset contains a bit.
        System.out.println(players.toByteArray());
    }
}
