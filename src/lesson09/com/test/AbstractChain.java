package lesson09.com.test;

public abstract class AbstractChain {
	private AbstractChain chain;
	private Type type;

	public AbstractChain(Type type) {
		this.type = type;
	}

	public AbstractChain setChain(AbstractChain chain) {
		this.chain = chain;
		return chain;
	}

	public void exe(Type type) {
		if (this.type == type) {
			this.perform();
			return;
		}
		this.chain.exe(type);
	}

	protected abstract void perform();
}
