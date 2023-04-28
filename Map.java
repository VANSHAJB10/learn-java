// Map 
Map<String,String> m = new TreeMap(); //We can't create child of a map as  Map is an Interface
System.out.println(m.size());

m.clear();
m.put("Rollno", "1");
m.put("Gender", "M");
m.put("Enrolled?", "Yes");

if(((Object) m).sEmpty() == false){
       System.out.println("Empty");
}

Map m2 = null;
m2.pullAll(m);

if(m2.containsKey("1") ){
       System.out.println("yes!");
}

Set s2 = m2.keySet();
System.out.println(s2);

Collection v1 = m2.values();
System.out.println(v1);




// Entry SET

Set<Map.Entry> ss = m2.entrySet();
for (Map.Entry m2 :ss){
       System.out.println(m2.getKey());
