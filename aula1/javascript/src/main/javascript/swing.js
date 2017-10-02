// usando Swing em Java
// imports
var imports = new JavaImporter(
    javax.swing,
    java.awt.event,
    java.lang);

with(imports){
// new em classes java
	var frame = new JFrame("Swing JS");
	var button = new JButton("Clique aqui");
	
	frame.add(button);
	frame.setSize(300, 150);
	
	button.addActionListener(
			// classe anonima em js implementando interface java
			new ActionListener() {
				actionPerformed: function(event) {
					print("Clicado!!");
				}
			}
	);
	
// chamada a setter a la propriedade
	frame.visible = true;
	frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE;
}
