JPanel p = new JPanel();
p.setLayout(new GridLayout(0, 0));
p.add(new JButton("1"));
p.add(new JButton("2"));

// Runtime error 
// as in ***   p.setLayout(new GridLayout(int 1 , int 2)); *** -->  0 as an input is considered as a variable and the int value is taken to be a constant.

