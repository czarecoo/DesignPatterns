package behavioral.mediator.lights;

class Light {
	enum State {
		ON, OFF
	}

	private String color;
	private State currentState;
	private LightMediator lightMediator;

	Light(String color, LightMediator lightMediator) {
		this.color = color;
		this.lightMediator = lightMediator;
		currentState = State.OFF;
		lightMediator.registerLight(this);
	}

	void turnOn() {
		currentState = State.ON;
		lightMediator.notifyMediator(this);
	}

	void turnOff() {
		currentState = State.OFF;
	}

	public State getCurrentState() {
		return currentState;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Light other = (Light) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (currentState != other.currentState)
			return false;
		if (lightMediator == null) {
			if (other.lightMediator != null)
				return false;
		} else if (!lightMediator.equals(other.lightMediator))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return color;
	}
}