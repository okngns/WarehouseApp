// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package masterdata.proxies.microflows;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public final class Microflows
{
	/**
	 * Private constructor to prevent instantiation of this class. 
	 */
	private Microflows() {}

	// These are the microflows for the MasterData module
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder account_Commit_ManagerBuilder(
		administration.proxies.Account _newManagerAccount
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Account_Commit_Manager");
		builder = builder.withParam("NewManagerAccount", _newManagerAccount);
		return builder;
	}

	public static void account_Commit_Manager(
		IContext context,
		administration.proxies.Account _newManagerAccount
	)
	{
		account_Commit_ManagerBuilder(
				_newManagerAccount
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder account_OrderPicker_CommitBuilder(
		administration.proxies.Account _newOrderPickerAccount
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Account_OrderPicker_Commit");
		builder = builder.withParam("NewOrderPickerAccount", _newOrderPickerAccount);
		return builder;
	}

	public static void account_OrderPicker_Commit(
		IContext context,
		administration.proxies.Account _newOrderPickerAccount
	)
	{
		account_OrderPicker_CommitBuilder(
				_newOrderPickerAccount
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Article_CreateBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Article_Create");
		return builder;
	}

	public static void aCT_Article_Create(IContext context)
	{
		aCT_Article_CreateBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Article_DeleteBuilder(
		masterdata.proxies.Article _article
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Article_Delete");
		builder = builder.withParam("Article", _article);
		return builder;
	}

	public static void aCT_Article_Delete(
		IContext context,
		masterdata.proxies.Article _article
	)
	{
		aCT_Article_DeleteBuilder(
				_article
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Article_EditBuilder(
		masterdata.proxies.Article _article
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Article_Edit");
		builder = builder.withParam("Article", _article);
		return builder;
	}

	public static void aCT_Article_Edit(
		IContext context,
		masterdata.proxies.Article _article
	)
	{
		aCT_Article_EditBuilder(
				_article
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Article_Retrieve_LastPriceBuilder(
		masterdata.proxies.RetailPrice _retailPriceChange
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Article_Retrieve_LastPrice");
		builder = builder.withParam("RetailPriceChange", _retailPriceChange);
		return builder;
	}

	public static void aCT_Article_Retrieve_LastPrice(
		IContext context,
		masterdata.proxies.RetailPrice _retailPriceChange
	)
	{
		aCT_Article_Retrieve_LastPriceBuilder(
				_retailPriceChange
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Article_SaveBuilder(
		masterdata.proxies.Article _article
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Article_Save");
		builder = builder.withParam("Article", _article);
		return builder;
	}

	public static masterdata.proxies.Article aCT_Article_Save(
		IContext context,
		masterdata.proxies.Article _article
	)
	{
		Object result = aCT_Article_SaveBuilder(
				_article
			)
			.execute(context);
		return result == null ? null : masterdata.proxies.Article.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Article_ShowOverviewBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Article_ShowOverview");
		return builder;
	}

	public static void aCT_Article_ShowOverview(IContext context)
	{
		aCT_Article_ShowOverviewBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_LastRetailPrice_ShowOverviewBuilder(
		masterdata.proxies.Article _article
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_LastRetailPrice_ShowOverview");
		builder = builder.withParam("Article", _article);
		return builder;
	}

	public static void aCT_LastRetailPrice_ShowOverview(
		IContext context,
		masterdata.proxies.Article _article
	)
	{
		aCT_LastRetailPrice_ShowOverviewBuilder(
				_article
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Location_DeleteBuilder(
		masterdata.proxies.Location _location
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Location_Delete");
		builder = builder.withParam("Location", _location);
		return builder;
	}

	public static void aCT_Location_Delete(
		IContext context,
		masterdata.proxies.Location _location
	)
	{
		aCT_Location_DeleteBuilder(
				_location
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Location_SaveBuilder(
		masterdata.proxies.Location _newLocation
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Location_Save");
		builder = builder.withParam("NewLocation", _newLocation);
		return builder;
	}

	public static masterdata.proxies.Location aCT_Location_Save(
		IContext context,
		masterdata.proxies.Location _newLocation
	)
	{
		Object result = aCT_Location_SaveBuilder(
				_newLocation
			)
			.execute(context);
		return result == null ? null : masterdata.proxies.Location.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Location_ShowOverviewBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Location_ShowOverview");
		return builder;
	}

	public static void aCT_Location_ShowOverview(IContext context)
	{
		aCT_Location_ShowOverviewBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_LocationNewEditBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_LocationNewEdit");
		return builder;
	}

	public static void aCT_LocationNewEdit(IContext context)
	{
		aCT_LocationNewEditBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Manager_DeleteBuilder(
		masterdata.proxies.Manager _manager
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Manager_Delete");
		builder = builder.withParam("Manager", _manager);
		return builder;
	}

	public static void aCT_Manager_Delete(
		IContext context,
		masterdata.proxies.Manager _manager
	)
	{
		aCT_Manager_DeleteBuilder(
				_manager
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Manager_SaveBuilder(
		masterdata.proxies.Manager _newManager
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Manager_Save");
		builder = builder.withParam("NewManager", _newManager);
		return builder;
	}

	public static masterdata.proxies.Manager aCT_Manager_Save(
		IContext context,
		masterdata.proxies.Manager _newManager
	)
	{
		Object result = aCT_Manager_SaveBuilder(
				_newManager
			)
			.execute(context);
		return result == null ? null : masterdata.proxies.Manager.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Manager_ShowManagerSelectBuilder(
		masterdata.proxies.Warehouse _warehouse
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Manager_ShowManagerSelect");
		builder = builder.withParam("Warehouse", _warehouse);
		return builder;
	}

	public static masterdata.proxies.Manager aCT_Manager_ShowManagerSelect(
		IContext context,
		masterdata.proxies.Warehouse _warehouse
	)
	{
		Object result = aCT_Manager_ShowManagerSelectBuilder(
				_warehouse
			)
			.execute(context);
		return result == null ? null : masterdata.proxies.Manager.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Manager_ShowNewEditBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Manager_ShowNewEdit");
		return builder;
	}

	public static void aCT_Manager_ShowNewEdit(IContext context)
	{
		aCT_Manager_ShowNewEditBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Manager_ShowOverviewBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Manager_ShowOverview");
		return builder;
	}

	public static void aCT_Manager_ShowOverview(IContext context)
	{
		aCT_Manager_ShowOverviewBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_NewRetailPrice_CreateBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_NewRetailPrice_Create");
		return builder;
	}

	public static void aCT_NewRetailPrice_Create(IContext context)
	{
		aCT_NewRetailPrice_CreateBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Orderpicker_CreateBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Orderpicker_Create");
		return builder;
	}

	public static void aCT_Orderpicker_Create(IContext context)
	{
		aCT_Orderpicker_CreateBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_OrderPicker_DeleteBuilder(
		masterdata.proxies.OrderPicker _orderPicker
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_OrderPicker_Delete");
		builder = builder.withParam("OrderPicker", _orderPicker);
		return builder;
	}

	public static void aCT_OrderPicker_Delete(
		IContext context,
		masterdata.proxies.OrderPicker _orderPicker
	)
	{
		aCT_OrderPicker_DeleteBuilder(
				_orderPicker
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_OrderPicker_EditBuilder(
		masterdata.proxies.OrderPicker _orderPicker
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_OrderPicker_Edit");
		builder = builder.withParam("OrderPicker", _orderPicker);
		return builder;
	}

	public static void aCT_OrderPicker_Edit(
		IContext context,
		masterdata.proxies.OrderPicker _orderPicker
	)
	{
		aCT_OrderPicker_EditBuilder(
				_orderPicker
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_OrderPicker_SaveBuilder(
		masterdata.proxies.OrderPicker _newOrderPicker
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_OrderPicker_Save");
		builder = builder.withParam("NewOrderPicker", _newOrderPicker);
		return builder;
	}

	public static void aCT_OrderPicker_Save(
		IContext context,
		masterdata.proxies.OrderPicker _newOrderPicker
	)
	{
		aCT_OrderPicker_SaveBuilder(
				_newOrderPicker
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_OrderPicker_ShowBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_OrderPicker_Show");
		return builder;
	}

	public static void aCT_OrderPicker_Show(IContext context)
	{
		aCT_OrderPicker_ShowBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Warehouse_AssignManagerBuilder(
		masterdata.proxies.Warehouse _warehouse
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Warehouse_AssignManager");
		builder = builder.withParam("Warehouse", _warehouse);
		return builder;
	}

	public static void aCT_Warehouse_AssignManager(
		IContext context,
		masterdata.proxies.Warehouse _warehouse
	)
	{
		aCT_Warehouse_AssignManagerBuilder(
				_warehouse
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Warehouse_DeleteBuilder(
		masterdata.proxies.Warehouse _warehouse
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Warehouse_Delete");
		builder = builder.withParam("Warehouse", _warehouse);
		return builder;
	}

	public static void aCT_Warehouse_Delete(
		IContext context,
		masterdata.proxies.Warehouse _warehouse
	)
	{
		aCT_Warehouse_DeleteBuilder(
				_warehouse
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Warehouse_EditBuilder(
		masterdata.proxies.Warehouse _warehouse
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Warehouse_Edit");
		builder = builder.withParam("Warehouse", _warehouse);
		return builder;
	}

	public static void aCT_Warehouse_Edit(
		IContext context,
		masterdata.proxies.Warehouse _warehouse
	)
	{
		aCT_Warehouse_EditBuilder(
				_warehouse
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Warehouse_SaveBuilder(
		masterdata.proxies.Warehouse _warehouse
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Warehouse_Save");
		builder = builder.withParam("Warehouse", _warehouse);
		return builder;
	}

	public static void aCT_Warehouse_Save(
		IContext context,
		masterdata.proxies.Warehouse _warehouse
	)
	{
		aCT_Warehouse_SaveBuilder(
				_warehouse
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Warehouse_ShowNewEditBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Warehouse_ShowNewEdit");
		return builder;
	}

	public static void aCT_Warehouse_ShowNewEdit(IContext context)
	{
		aCT_Warehouse_ShowNewEditBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder aCT_Warehouse_ShowOverviewBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.ACT_Warehouse_ShowOverview");
		return builder;
	}

	public static void aCT_Warehouse_ShowOverview(IContext context)
	{
		aCT_Warehouse_ShowOverviewBuilder().execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder article_CommitBuilder(
		masterdata.proxies.Article _article
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Article_Commit");
		builder = builder.withParam("Article", _article);
		return builder;
	}

	public static void article_Commit(
		IContext context,
		masterdata.proxies.Article _article
	)
	{
		article_CommitBuilder(
				_article
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder article_DeleteBuilder(
		masterdata.proxies.Article _article
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Article_Delete");
		builder = builder.withParam("Article", _article);
		return builder;
	}

	public static void article_Delete(
		IContext context,
		masterdata.proxies.Article _article
	)
	{
		article_DeleteBuilder(
				_article
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder create_Account_ManagerBuilder(
		masterdata.proxies.Manager _newManager,
		system.proxies.UserRole _userRoleManager
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Create_Account_Manager");
		builder = builder.withParam("NewManager", _newManager);
		builder = builder.withParam("UserRoleManager", _userRoleManager);
		return builder;
	}

	public static administration.proxies.Account create_Account_Manager(
		IContext context,
		masterdata.proxies.Manager _newManager,
		system.proxies.UserRole _userRoleManager
	)
	{
		Object result = create_Account_ManagerBuilder(
				_newManager,
				_userRoleManager
			)
			.execute(context);
		return result == null ? null : administration.proxies.Account.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder create_Account_OrderPickerBuilder(
		masterdata.proxies.OrderPicker _newOrderPicker,
		system.proxies.UserRole _userRoleManager
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Create_Account_OrderPicker");
		builder = builder.withParam("NewOrderPicker", _newOrderPicker);
		builder = builder.withParam("UserRoleManager", _userRoleManager);
		return builder;
	}

	public static administration.proxies.Account create_Account_OrderPicker(
		IContext context,
		masterdata.proxies.OrderPicker _newOrderPicker,
		system.proxies.UserRole _userRoleManager
	)
	{
		Object result = create_Account_OrderPickerBuilder(
				_newOrderPicker,
				_userRoleManager
			)
			.execute(context);
		return result == null ? null : administration.proxies.Account.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder dS_Account_CurrentUserBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.DS_Account_CurrentUser");
		return builder;
	}

	public static administration.proxies.Account dS_Account_CurrentUser(IContext context)
	{
		Object result = dS_Account_CurrentUserBuilder().execute(context);
		return result == null ? null : administration.proxies.Account.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder location_CommitBuilder(
		masterdata.proxies.Location _newLocation
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Location_Commit");
		builder = builder.withParam("NewLocation", _newLocation);
		return builder;
	}

	public static void location_Commit(
		IContext context,
		masterdata.proxies.Location _newLocation
	)
	{
		location_CommitBuilder(
				_newLocation
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder location_DeleteBuilder(
		masterdata.proxies.Location _location
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Location_Delete");
		builder = builder.withParam("Location", _location);
		return builder;
	}

	public static void location_Delete(
		IContext context,
		masterdata.proxies.Location _location
	)
	{
		location_DeleteBuilder(
				_location
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder manager_Associate_AccountBuilder(
		masterdata.proxies.Manager _newManager,
		administration.proxies.Account _newManagerAccount
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Manager_Associate_Account");
		builder = builder.withParam("NewManager", _newManager);
		builder = builder.withParam("NewManagerAccount", _newManagerAccount);
		return builder;
	}

	public static void manager_Associate_Account(
		IContext context,
		masterdata.proxies.Manager _newManager,
		administration.proxies.Account _newManagerAccount
	)
	{
		manager_Associate_AccountBuilder(
				_newManager,
				_newManagerAccount
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder manager_CommitBuilder(
		masterdata.proxies.Manager _newManager
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Manager_Commit");
		builder = builder.withParam("NewManager", _newManager);
		return builder;
	}

	public static void manager_Commit(
		IContext context,
		masterdata.proxies.Manager _newManager
	)
	{
		manager_CommitBuilder(
				_newManager
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder manager_CreateBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Manager_Create");
		return builder;
	}

	public static masterdata.proxies.Manager manager_Create(IContext context)
	{
		Object result = manager_CreateBuilder().execute(context);
		return result == null ? null : masterdata.proxies.Manager.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder manager_DeleteBuilder(
		masterdata.proxies.Manager _manager
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Manager_Delete");
		builder = builder.withParam("Manager", _manager);
		return builder;
	}

	public static void manager_Delete(
		IContext context,
		masterdata.proxies.Manager _manager
	)
	{
		manager_DeleteBuilder(
				_manager
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder orderPicker_Assosiate_AccountBuilder(
		masterdata.proxies.OrderPicker _newOrderPicker
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.OrderPicker_Assosiate_Account");
		builder = builder.withParam("NewOrderPicker", _newOrderPicker);
		return builder;
	}

	public static void orderPicker_Assosiate_Account(
		IContext context,
		masterdata.proxies.OrderPicker _newOrderPicker
	)
	{
		orderPicker_Assosiate_AccountBuilder(
				_newOrderPicker
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder orderPicker_CommitBuilder(
		masterdata.proxies.OrderPicker _newOrderPicker
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.OrderPicker_Commit");
		builder = builder.withParam("NewOrderPicker", _newOrderPicker);
		return builder;
	}

	public static void orderPicker_Commit(
		IContext context,
		masterdata.proxies.OrderPicker _newOrderPicker
	)
	{
		orderPicker_CommitBuilder(
				_newOrderPicker
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder orderPicker_CreateBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.OrderPicker_Create");
		return builder;
	}

	public static masterdata.proxies.OrderPicker orderPicker_Create(IContext context)
	{
		Object result = orderPicker_CreateBuilder().execute(context);
		return result == null ? null : masterdata.proxies.OrderPicker.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder orderPicker_DeleteBuilder(
		masterdata.proxies.OrderPicker _orderPicker
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.OrderPicker_Delete");
		builder = builder.withParam("OrderPicker", _orderPicker);
		return builder;
	}

	public static void orderPicker_Delete(
		IContext context,
		masterdata.proxies.OrderPicker _orderPicker
	)
	{
		orderPicker_DeleteBuilder(
				_orderPicker
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder retrieve_UserRole_ManagerBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Retrieve_UserRole_Manager");
		return builder;
	}

	public static system.proxies.UserRole retrieve_UserRole_Manager(IContext context)
	{
		Object result = retrieve_UserRole_ManagerBuilder().execute(context);
		return result == null ? null : system.proxies.UserRole.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder retrieve_UserRole_OrderPickerBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Retrieve_UserRole_OrderPicker");
		return builder;
	}

	public static system.proxies.UserRole retrieve_UserRole_OrderPicker(IContext context)
	{
		Object result = retrieve_UserRole_OrderPickerBuilder().execute(context);
		return result == null ? null : system.proxies.UserRole.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder vAL_ArticleBuilder(
		masterdata.proxies.Article _article
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.VAL_Article");
		builder = builder.withParam("Article", _article);
		return builder;
	}

	public static boolean vAL_Article(
		IContext context,
		masterdata.proxies.Article _article
	)
	{
		Object result = vAL_ArticleBuilder(
				_article
			)
			.execute(context);
		return (boolean) result;
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder vAL_Email_UniqueBuilder(
		java.lang.String _newEmail
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.VAL_Email_Unique");
		builder = builder.withParam("NewEmail", _newEmail);
		return builder;
	}

	public static boolean vAL_Email_Unique(
		IContext context,
		java.lang.String _newEmail
	)
	{
		Object result = vAL_Email_UniqueBuilder(
				_newEmail
			)
			.execute(context);
		return (boolean) result;
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder vAL_LocationBuilder(
		masterdata.proxies.Location _location
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.VAL_Location");
		builder = builder.withParam("Location", _location);
		return builder;
	}

	public static boolean vAL_Location(
		IContext context,
		masterdata.proxies.Location _location
	)
	{
		Object result = vAL_LocationBuilder(
				_location
			)
			.execute(context);
		return (boolean) result;
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder vAL_ManagerBuilder(
		masterdata.proxies.Manager _manager
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.VAL_Manager");
		builder = builder.withParam("Manager", _manager);
		return builder;
	}

	public static boolean vAL_Manager(
		IContext context,
		masterdata.proxies.Manager _manager
	)
	{
		Object result = vAL_ManagerBuilder(
				_manager
			)
			.execute(context);
		return (boolean) result;
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder vAL_OrderPickerBuilder(
		masterdata.proxies.OrderPicker _orderPicker
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.VAL_OrderPicker");
		builder = builder.withParam("OrderPicker", _orderPicker);
		return builder;
	}

	public static boolean vAL_OrderPicker(
		IContext context,
		masterdata.proxies.OrderPicker _orderPicker
	)
	{
		Object result = vAL_OrderPickerBuilder(
				_orderPicker
			)
			.execute(context);
		return (boolean) result;
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder vAL_Password_ManagerBuilder(
		masterdata.proxies.Manager _manager,
		boolean _isRegistration
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.VAL_Password_Manager");
		builder = builder.withParam("Manager", _manager);
		builder = builder.withParam("isRegistration", _isRegistration);
		return builder;
	}

	public static boolean vAL_Password_Manager(
		IContext context,
		masterdata.proxies.Manager _manager,
		boolean _isRegistration
	)
	{
		Object result = vAL_Password_ManagerBuilder(
				_manager,
				_isRegistration
			)
			.execute(context);
		return (boolean) result;
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder vAL_Password_OrderPickerBuilder(
		masterdata.proxies.OrderPicker _orderPicker,
		boolean _isRegistration
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.VAL_Password_OrderPicker");
		builder = builder.withParam("OrderPicker", _orderPicker);
		builder = builder.withParam("isRegistration", _isRegistration);
		return builder;
	}

	public static boolean vAL_Password_OrderPicker(
		IContext context,
		masterdata.proxies.OrderPicker _orderPicker,
		boolean _isRegistration
	)
	{
		Object result = vAL_Password_OrderPickerBuilder(
				_orderPicker,
				_isRegistration
			)
			.execute(context);
		return (boolean) result;
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder vAL_RetailPriceBuilder(
		masterdata.proxies.RetailPrice _retailPriceChange
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.VAL_RetailPrice");
		builder = builder.withParam("RetailPriceChange", _retailPriceChange);
		return builder;
	}

	public static boolean vAL_RetailPrice(
		IContext context,
		masterdata.proxies.RetailPrice _retailPriceChange
	)
	{
		Object result = vAL_RetailPriceBuilder(
				_retailPriceChange
			)
			.execute(context);
		return (boolean) result;
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder vAL_Unique_LocationBuilder(
		masterdata.proxies.Location _newLocation
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.VAL_Unique_Location");
		builder = builder.withParam("NewLocation", _newLocation);
		return builder;
	}

	public static boolean vAL_Unique_Location(
		IContext context,
		masterdata.proxies.Location _newLocation
	)
	{
		Object result = vAL_Unique_LocationBuilder(
				_newLocation
			)
			.execute(context);
		return (boolean) result;
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder warehouse_CommitBuilder(
		masterdata.proxies.Warehouse _warehouse
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Warehouse_Commit");
		builder = builder.withParam("Warehouse", _warehouse);
		return builder;
	}

	public static void warehouse_Commit(
		IContext context,
		masterdata.proxies.Warehouse _warehouse
	)
	{
		warehouse_CommitBuilder(
				_warehouse
			)
			.execute(context);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder warehouse_CreateBuilder()
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Warehouse_Create");
		return builder;
	}

	public static masterdata.proxies.Warehouse warehouse_Create(IContext context)
	{
		Object result = warehouse_CreateBuilder().execute(context);
		return result == null ? null : masterdata.proxies.Warehouse.initialize(context, (IMendixObject) result);
	}
	public static com.mendix.core.actionmanagement.MicroflowCallBuilder warehouse_DeleteBuilder(
		masterdata.proxies.Warehouse _warehouse
	)
	{
		com.mendix.core.actionmanagement.MicroflowCallBuilder builder = Core.microflowCall("MasterData.Warehouse_Delete");
		builder = builder.withParam("Warehouse", _warehouse);
		return builder;
	}

	public static void warehouse_Delete(
		IContext context,
		masterdata.proxies.Warehouse _warehouse
	)
	{
		warehouse_DeleteBuilder(
				_warehouse
			)
			.execute(context);
	}
}
