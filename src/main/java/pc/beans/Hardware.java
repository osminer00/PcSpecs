package pc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Owen Miner - osminer
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
@Entity
public class Hardware {
	@Id
	@GeneratedValue
	private int id;
	private String gpu;
	private String cpu;
	private int memory;
	private int storage;
	
	public Hardware() {
		super();
	}
	public Hardware(String gpu, String cpu, int memory, int storage) {
		super();
		this.gpu = gpu;
		this.cpu = cpu;
		this.memory = memory;
		this.storage = storage;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the gpu
	 */
	public String getGpu() {
		return gpu;
	}
	/**
	 * @param gpu the gpu to set
	 */
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	/**
	 * @return the cpu
	 */
	public String getCpu() {
		return cpu;
	}
	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	/**
	 * @return the memory
	 */
	public int getMemory() {
		return memory;
	}
	/**
	 * @param memory the memory to set
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}
	/**
	 * @return the storage
	 */
	public int getStorage() {
		return storage;
	}
	/**
	 * @param storage the storage to set
	 */
	public void setStorage(int storage) {
		this.storage = storage;
	}
	@Override
	public String toString() {
		return "Hardware [id = " + id + ", Graphics Card = " + gpu + ", CPU = " + cpu + ", Memory = " + memory + "gb, Storage = " + storage
				+ "gb]";
	}
	
}
