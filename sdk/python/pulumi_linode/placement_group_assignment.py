# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['PlacementGroupAssignmentArgs', 'PlacementGroupAssignment']

@pulumi.input_type
class PlacementGroupAssignmentArgs:
    def __init__(__self__, *,
                 linode_id: pulumi.Input[int],
                 placement_group_id: pulumi.Input[int],
                 compliant_only: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a PlacementGroupAssignment resource.
        :param pulumi.Input[int] linode_id: The unique ID of the Linode to assign.
        :param pulumi.Input[int] placement_group_id: The unique ID of the target Placement Group.
        """
        pulumi.set(__self__, "linode_id", linode_id)
        pulumi.set(__self__, "placement_group_id", placement_group_id)
        if compliant_only is not None:
            pulumi.set(__self__, "compliant_only", compliant_only)

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> pulumi.Input[int]:
        """
        The unique ID of the Linode to assign.
        """
        return pulumi.get(self, "linode_id")

    @linode_id.setter
    def linode_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "linode_id", value)

    @property
    @pulumi.getter(name="placementGroupId")
    def placement_group_id(self) -> pulumi.Input[int]:
        """
        The unique ID of the target Placement Group.
        """
        return pulumi.get(self, "placement_group_id")

    @placement_group_id.setter
    def placement_group_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "placement_group_id", value)

    @property
    @pulumi.getter(name="compliantOnly")
    def compliant_only(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "compliant_only")

    @compliant_only.setter
    def compliant_only(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "compliant_only", value)


@pulumi.input_type
class _PlacementGroupAssignmentState:
    def __init__(__self__, *,
                 compliant_only: Optional[pulumi.Input[bool]] = None,
                 linode_id: Optional[pulumi.Input[int]] = None,
                 placement_group_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering PlacementGroupAssignment resources.
        :param pulumi.Input[int] linode_id: The unique ID of the Linode to assign.
        :param pulumi.Input[int] placement_group_id: The unique ID of the target Placement Group.
        """
        if compliant_only is not None:
            pulumi.set(__self__, "compliant_only", compliant_only)
        if linode_id is not None:
            pulumi.set(__self__, "linode_id", linode_id)
        if placement_group_id is not None:
            pulumi.set(__self__, "placement_group_id", placement_group_id)

    @property
    @pulumi.getter(name="compliantOnly")
    def compliant_only(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "compliant_only")

    @compliant_only.setter
    def compliant_only(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "compliant_only", value)

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> Optional[pulumi.Input[int]]:
        """
        The unique ID of the Linode to assign.
        """
        return pulumi.get(self, "linode_id")

    @linode_id.setter
    def linode_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "linode_id", value)

    @property
    @pulumi.getter(name="placementGroupId")
    def placement_group_id(self) -> Optional[pulumi.Input[int]]:
        """
        The unique ID of the target Placement Group.
        """
        return pulumi.get(self, "placement_group_id")

    @placement_group_id.setter
    def placement_group_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "placement_group_id", value)


class PlacementGroupAssignment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compliant_only: Optional[pulumi.Input[bool]] = None,
                 linode_id: Optional[pulumi.Input[int]] = None,
                 placement_group_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Manages a single assignment between a Linode and a Placement Group.
        For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-group-add-linode).

        **NOTE: Placement Groups may not currently be available to all users.**

        To prevent update conflicts, Linodes managed through the `Instance` resource should specify `placement_group_externally_managed`:

        ```python
        import pulumi
        import pulumi_linode as linode

        my_instance = linode.Instance("my-instance", placement_group_externally_managed=True)
        ```

        ## Example Usage

        ```python
        import pulumi
        import pulumi_linode as linode

        my_pg = linode.PlacementGroup("my-pg",
            label="my-pg",
            region="us-east",
            placement_group_type="anti_affinity:local")
        my_inst = linode.Instance("my-inst",
            label="my-inst",
            region="us-east",
            type="g6-nanode-1",
            placement_group_externally_managed=True)
        my_assignment = linode.PlacementGroupAssignment("my-assignment",
            placement_group_id=my_pg.id,
            linode_id=my_inst.id)
        ```

        ## Import

        Placement Group assignments can be imported using the Placement Group's ID followed by the Linode's ID separated by a comma, e.g.

        ```sh
        $ pulumi import linode:index/placementGroupAssignment:PlacementGroupAssignment my-assignment 1234567,7654321
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] linode_id: The unique ID of the Linode to assign.
        :param pulumi.Input[int] placement_group_id: The unique ID of the target Placement Group.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PlacementGroupAssignmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a single assignment between a Linode and a Placement Group.
        For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-group-add-linode).

        **NOTE: Placement Groups may not currently be available to all users.**

        To prevent update conflicts, Linodes managed through the `Instance` resource should specify `placement_group_externally_managed`:

        ```python
        import pulumi
        import pulumi_linode as linode

        my_instance = linode.Instance("my-instance", placement_group_externally_managed=True)
        ```

        ## Example Usage

        ```python
        import pulumi
        import pulumi_linode as linode

        my_pg = linode.PlacementGroup("my-pg",
            label="my-pg",
            region="us-east",
            placement_group_type="anti_affinity:local")
        my_inst = linode.Instance("my-inst",
            label="my-inst",
            region="us-east",
            type="g6-nanode-1",
            placement_group_externally_managed=True)
        my_assignment = linode.PlacementGroupAssignment("my-assignment",
            placement_group_id=my_pg.id,
            linode_id=my_inst.id)
        ```

        ## Import

        Placement Group assignments can be imported using the Placement Group's ID followed by the Linode's ID separated by a comma, e.g.

        ```sh
        $ pulumi import linode:index/placementGroupAssignment:PlacementGroupAssignment my-assignment 1234567,7654321
        ```

        :param str resource_name: The name of the resource.
        :param PlacementGroupAssignmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PlacementGroupAssignmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compliant_only: Optional[pulumi.Input[bool]] = None,
                 linode_id: Optional[pulumi.Input[int]] = None,
                 placement_group_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PlacementGroupAssignmentArgs.__new__(PlacementGroupAssignmentArgs)

            __props__.__dict__["compliant_only"] = compliant_only
            if linode_id is None and not opts.urn:
                raise TypeError("Missing required property 'linode_id'")
            __props__.__dict__["linode_id"] = linode_id
            if placement_group_id is None and not opts.urn:
                raise TypeError("Missing required property 'placement_group_id'")
            __props__.__dict__["placement_group_id"] = placement_group_id
        super(PlacementGroupAssignment, __self__).__init__(
            'linode:index/placementGroupAssignment:PlacementGroupAssignment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            compliant_only: Optional[pulumi.Input[bool]] = None,
            linode_id: Optional[pulumi.Input[int]] = None,
            placement_group_id: Optional[pulumi.Input[int]] = None) -> 'PlacementGroupAssignment':
        """
        Get an existing PlacementGroupAssignment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] linode_id: The unique ID of the Linode to assign.
        :param pulumi.Input[int] placement_group_id: The unique ID of the target Placement Group.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PlacementGroupAssignmentState.__new__(_PlacementGroupAssignmentState)

        __props__.__dict__["compliant_only"] = compliant_only
        __props__.__dict__["linode_id"] = linode_id
        __props__.__dict__["placement_group_id"] = placement_group_id
        return PlacementGroupAssignment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="compliantOnly")
    def compliant_only(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "compliant_only")

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> pulumi.Output[int]:
        """
        The unique ID of the Linode to assign.
        """
        return pulumi.get(self, "linode_id")

    @property
    @pulumi.getter(name="placementGroupId")
    def placement_group_id(self) -> pulumi.Output[int]:
        """
        The unique ID of the target Placement Group.
        """
        return pulumi.get(self, "placement_group_id")

