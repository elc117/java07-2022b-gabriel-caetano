public class MyTurtle extends BaseTurtle {
    public void draw() {
        this.setDelay(20);
		pen.setColor(0,0,0);
        double size = 0.1;
        double oldSize = 0.00;
        int xFlag = 1;
        int yFlag = 1;
        for (int i = 0; i < 50; i++) {
            this.square(size);
            // atualiza informações para o próximo quadrado 
            pen.up();
            // novo ponto de partida do quadrado
            this.turn(90);
            double newX = this.getX() + size * xFlag;
            double newY = this.getY() + size * yFlag;
            this.moveTo(newX, newY);
            pen.down();
            // se o deslocamento deve mover a tartaruga para direita esqeurda cima ou baixo
            if (i % 2 == 0) xFlag *= -1;
            else yFlag *= -1;
            // novo tamanho fibonacci
            double newSize = size + oldSize;
            oldSize = size;
            size = newSize;
        }

    }

    private void square(double size) {
		for (int i = 0; i < 4; i++) {
			this.forward(size);
			this.turn(90);
		}
	}
}
