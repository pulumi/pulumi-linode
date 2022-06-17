# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['DatabaseAccessControlsArgs', 'DatabaseAccessControls']

@pulumi.input_type
class DatabaseAccessControlsArgs:
    def __init__(__self__, *,
                 allow_lists: pulumi.Input[Sequence[pulumi.Input[str]]],
                 database_id: pulumi.Input[int],
                 database_type: pulumi.Input[str]):
        """
        The set of arguments for constructing a DatabaseAccessControls resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allow_lists: A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
        :param pulumi.Input[int] database_id: The unique ID of the target database.
        :param pulumi.Input[str] database_type: The unique type of the target database. (`mysql`, `mongodb`, `postgresql`)
        """
        pulumi.set(__self__, "allow_lists", allow_lists)
        pulumi.set(__self__, "database_id", database_id)
        pulumi.set(__self__, "database_type", database_type)

    @property
    @pulumi.getter(name="allowLists")
    def allow_lists(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
        """
        return pulumi.get(self, "allow_lists")

    @allow_lists.setter
    def allow_lists(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "allow_lists", value)

    @property
    @pulumi.getter(name="databaseId")
    def database_id(self) -> pulumi.Input[int]:
        """
        The unique ID of the target database.
        """
        return pulumi.get(self, "database_id")

    @database_id.setter
    def database_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "database_id", value)

    @property
    @pulumi.getter(name="databaseType")
    def database_type(self) -> pulumi.Input[str]:
        """
        The unique type of the target database. (`mysql`, `mongodb`, `postgresql`)
        """
        return pulumi.get(self, "database_type")

    @database_type.setter
    def database_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "database_type", value)


@pulumi.input_type
class _DatabaseAccessControlsState:
    def __init__(__self__, *,
                 allow_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 database_id: Optional[pulumi.Input[int]] = None,
                 database_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DatabaseAccessControls resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allow_lists: A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
        :param pulumi.Input[int] database_id: The unique ID of the target database.
        :param pulumi.Input[str] database_type: The unique type of the target database. (`mysql`, `mongodb`, `postgresql`)
        """
        if allow_lists is not None:
            pulumi.set(__self__, "allow_lists", allow_lists)
        if database_id is not None:
            pulumi.set(__self__, "database_id", database_id)
        if database_type is not None:
            pulumi.set(__self__, "database_type", database_type)

    @property
    @pulumi.getter(name="allowLists")
    def allow_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
        """
        return pulumi.get(self, "allow_lists")

    @allow_lists.setter
    def allow_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allow_lists", value)

    @property
    @pulumi.getter(name="databaseId")
    def database_id(self) -> Optional[pulumi.Input[int]]:
        """
        The unique ID of the target database.
        """
        return pulumi.get(self, "database_id")

    @database_id.setter
    def database_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "database_id", value)

    @property
    @pulumi.getter(name="databaseType")
    def database_type(self) -> Optional[pulumi.Input[str]]:
        """
        The unique type of the target database. (`mysql`, `mongodb`, `postgresql`)
        """
        return pulumi.get(self, "database_type")

    @database_type.setter
    def database_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database_type", value)


class DatabaseAccessControls(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 database_id: Optional[pulumi.Input[int]] = None,
                 database_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages the access control for a Linode Database. Only one `DatabaseAccessControls` resource should be defined per-database.

        ## Example Usage

        Grant a Linode access to a database:

        ```python
        import pulumi
        import pulumi_linode as linode

        my_instance = linode.Instance("my-instance",
            label="myinstance",
            region="us-southeast",
            type="g6-nanode-1",
            image="linode/alpine3.14")
        my_db = linode.DatabaseMysql("my-db",
            label="mydatabase",
            engine_id="mysql/8.0.26",
            region="us-southeast",
            type="g6-nanode-1")
        my_access = linode.DatabaseAccessControls("my-access",
            database_id=my_db.id,
            database_type="mysql",
            allow_lists=[my_instance.ip_address])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allow_lists: A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
        :param pulumi.Input[int] database_id: The unique ID of the target database.
        :param pulumi.Input[str] database_type: The unique type of the target database. (`mysql`, `mongodb`, `postgresql`)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DatabaseAccessControlsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages the access control for a Linode Database. Only one `DatabaseAccessControls` resource should be defined per-database.

        ## Example Usage

        Grant a Linode access to a database:

        ```python
        import pulumi
        import pulumi_linode as linode

        my_instance = linode.Instance("my-instance",
            label="myinstance",
            region="us-southeast",
            type="g6-nanode-1",
            image="linode/alpine3.14")
        my_db = linode.DatabaseMysql("my-db",
            label="mydatabase",
            engine_id="mysql/8.0.26",
            region="us-southeast",
            type="g6-nanode-1")
        my_access = linode.DatabaseAccessControls("my-access",
            database_id=my_db.id,
            database_type="mysql",
            allow_lists=[my_instance.ip_address])
        ```

        :param str resource_name: The name of the resource.
        :param DatabaseAccessControlsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatabaseAccessControlsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 database_id: Optional[pulumi.Input[int]] = None,
                 database_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatabaseAccessControlsArgs.__new__(DatabaseAccessControlsArgs)

            if allow_lists is None and not opts.urn:
                raise TypeError("Missing required property 'allow_lists'")
            __props__.__dict__["allow_lists"] = allow_lists
            if database_id is None and not opts.urn:
                raise TypeError("Missing required property 'database_id'")
            __props__.__dict__["database_id"] = database_id
            if database_type is None and not opts.urn:
                raise TypeError("Missing required property 'database_type'")
            __props__.__dict__["database_type"] = database_type
        super(DatabaseAccessControls, __self__).__init__(
            'linode:index/databaseAccessControls:DatabaseAccessControls',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allow_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            database_id: Optional[pulumi.Input[int]] = None,
            database_type: Optional[pulumi.Input[str]] = None) -> 'DatabaseAccessControls':
        """
        Get an existing DatabaseAccessControls resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allow_lists: A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
        :param pulumi.Input[int] database_id: The unique ID of the target database.
        :param pulumi.Input[str] database_type: The unique type of the target database. (`mysql`, `mongodb`, `postgresql`)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatabaseAccessControlsState.__new__(_DatabaseAccessControlsState)

        __props__.__dict__["allow_lists"] = allow_lists
        __props__.__dict__["database_id"] = database_id
        __props__.__dict__["database_type"] = database_type
        return DatabaseAccessControls(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowLists")
    def allow_lists(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
        """
        return pulumi.get(self, "allow_lists")

    @property
    @pulumi.getter(name="databaseId")
    def database_id(self) -> pulumi.Output[int]:
        """
        The unique ID of the target database.
        """
        return pulumi.get(self, "database_id")

    @property
    @pulumi.getter(name="databaseType")
    def database_type(self) -> pulumi.Output[str]:
        """
        The unique type of the target database. (`mysql`, `mongodb`, `postgresql`)
        """
        return pulumi.get(self, "database_type")

