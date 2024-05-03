// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package masterdata.proxies;

public class OrderItem implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject orderItemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MasterData.OrderItem";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Quantity("Quantity"),
		OrderItem_Order("MasterData.OrderItem_Order");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public OrderItem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected OrderItem(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject orderItemMendixObject)
	{
		if (orderItemMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, orderItemMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.orderItemMendixObject = orderItemMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static masterdata.proxies.OrderItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new masterdata.proxies.OrderItem(context, mendixObject);
	}

	public static masterdata.proxies.OrderItem load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return masterdata.proxies.OrderItem.initialize(context, mendixObject);
	}

	public static java.util.List<masterdata.proxies.OrderItem> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> masterdata.proxies.OrderItem.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of Quantity
	 */
	public final java.lang.String getQuantity()
	{
		return getQuantity(getContext());
	}

	/**
	 * @param context
	 * @return value of Quantity
	 */
	public final java.lang.String getQuantity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Quantity.toString());
	}

	/**
	 * Set value of Quantity
	 * @param quantity
	 */
	public final void setQuantity(java.lang.String quantity)
	{
		setQuantity(getContext(), quantity);
	}

	/**
	 * Set value of Quantity
	 * @param context
	 * @param quantity
	 */
	public final void setQuantity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String quantity)
	{
		getMendixObject().setValue(context, MemberNames.Quantity.toString(), quantity);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of OrderItem_Order
	 */
	public final masterdata.proxies.Order getOrderItem_Order() throws com.mendix.core.CoreException
	{
		return getOrderItem_Order(getContext());
	}

	/**
	 * @param context
	 * @return value of OrderItem_Order
	 * @throws com.mendix.core.CoreException
	 */
	public final masterdata.proxies.Order getOrderItem_Order(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		masterdata.proxies.Order result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OrderItem_Order.toString());
		if (identifier != null) {
			result = masterdata.proxies.Order.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of OrderItem_Order
	 * @param orderitem_order
	 */
	public final void setOrderItem_Order(masterdata.proxies.Order orderitem_order)
	{
		setOrderItem_Order(getContext(), orderitem_order);
	}

	/**
	 * Set value of OrderItem_Order
	 * @param context
	 * @param orderitem_order
	 */
	public final void setOrderItem_Order(com.mendix.systemwideinterfaces.core.IContext context, masterdata.proxies.Order orderitem_order)
	{
		if (orderitem_order == null) {
			getMendixObject().setValue(context, MemberNames.OrderItem_Order.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.OrderItem_Order.toString(), orderitem_order.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return orderItemMendixObject;
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final masterdata.proxies.OrderItem that = (masterdata.proxies.OrderItem) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
