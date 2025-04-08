# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['PlacementGroupArgs', 'PlacementGroup']

@pulumi.input_type
class PlacementGroupArgs:
    def __init__(__self__, *,
                 label: pulumi.Input[builtins.str],
                 placement_group_type: pulumi.Input[builtins.str],
                 region: pulumi.Input[builtins.str],
                 placement_group_policy: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a PlacementGroup resource.
        :param pulumi.Input[builtins.str] label: The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
        :param pulumi.Input[builtins.str] placement_group_type: The placement group type to use when placing Linodes in this group.
        :param pulumi.Input[builtins.str] region: The region of the Placement Group.
        :param pulumi.Input[builtins.str] placement_group_policy: Whether Linodes must be able to become compliant during assignment. (Default `strict`)
        """
        pulumi.set(__self__, "label", label)
        pulumi.set(__self__, "placement_group_type", placement_group_type)
        pulumi.set(__self__, "region", region)
        if placement_group_policy is not None:
            pulumi.set(__self__, "placement_group_policy", placement_group_policy)

    @property
    @pulumi.getter
    def label(self) -> pulumi.Input[builtins.str]:
        """
        The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="placementGroupType")
    def placement_group_type(self) -> pulumi.Input[builtins.str]:
        """
        The placement group type to use when placing Linodes in this group.
        """
        return pulumi.get(self, "placement_group_type")

    @placement_group_type.setter
    def placement_group_type(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "placement_group_type", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[builtins.str]:
        """
        The region of the Placement Group.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="placementGroupPolicy")
    def placement_group_policy(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Whether Linodes must be able to become compliant during assignment. (Default `strict`)
        """
        return pulumi.get(self, "placement_group_policy")

    @placement_group_policy.setter
    def placement_group_policy(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "placement_group_policy", value)


@pulumi.input_type
class _PlacementGroupState:
    def __init__(__self__, *,
                 is_compliant: Optional[pulumi.Input[builtins.bool]] = None,
                 label: Optional[pulumi.Input[builtins.str]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input['PlacementGroupMemberArgs']]]] = None,
                 placement_group_policy: Optional[pulumi.Input[builtins.str]] = None,
                 placement_group_type: Optional[pulumi.Input[builtins.str]] = None,
                 region: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering PlacementGroup resources.
        :param pulumi.Input[builtins.bool] is_compliant: Whether this Linode is currently compliant with the group's placement group type.
        :param pulumi.Input[builtins.str] label: The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
        :param pulumi.Input[Sequence[pulumi.Input['PlacementGroupMemberArgs']]] members: A set of Linodes currently assigned to this Placement Group.
        :param pulumi.Input[builtins.str] placement_group_policy: Whether Linodes must be able to become compliant during assignment. (Default `strict`)
        :param pulumi.Input[builtins.str] placement_group_type: The placement group type to use when placing Linodes in this group.
        :param pulumi.Input[builtins.str] region: The region of the Placement Group.
        """
        if is_compliant is not None:
            pulumi.set(__self__, "is_compliant", is_compliant)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if members is not None:
            pulumi.set(__self__, "members", members)
        if placement_group_policy is not None:
            pulumi.set(__self__, "placement_group_policy", placement_group_policy)
        if placement_group_type is not None:
            pulumi.set(__self__, "placement_group_type", placement_group_type)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter(name="isCompliant")
    def is_compliant(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Whether this Linode is currently compliant with the group's placement group type.
        """
        return pulumi.get(self, "is_compliant")

    @is_compliant.setter
    def is_compliant(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "is_compliant", value)

    @property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter
    def members(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PlacementGroupMemberArgs']]]]:
        """
        A set of Linodes currently assigned to this Placement Group.
        """
        return pulumi.get(self, "members")

    @members.setter
    def members(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PlacementGroupMemberArgs']]]]):
        pulumi.set(self, "members", value)

    @property
    @pulumi.getter(name="placementGroupPolicy")
    def placement_group_policy(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Whether Linodes must be able to become compliant during assignment. (Default `strict`)
        """
        return pulumi.get(self, "placement_group_policy")

    @placement_group_policy.setter
    def placement_group_policy(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "placement_group_policy", value)

    @property
    @pulumi.getter(name="placementGroupType")
    def placement_group_type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The placement group type to use when placing Linodes in this group.
        """
        return pulumi.get(self, "placement_group_type")

    @placement_group_type.setter
    def placement_group_type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "placement_group_type", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The region of the Placement Group.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "region", value)


class PlacementGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 label: Optional[pulumi.Input[builtins.str]] = None,
                 placement_group_policy: Optional[pulumi.Input[builtins.str]] = None,
                 placement_group_type: Optional[pulumi.Input[builtins.str]] = None,
                 region: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Manages a Linode Placement Group.
        For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-placement-group).

        ## Example Usage

        Create a Placement Group with the local anti-affinity policy:

        ```python
        import pulumi
        import pulumi_linode as linode

        test = linode.PlacementGroup("test",
            label="my-placement-group",
            region="us-mia",
            placement_group_type="anti_affinity:local")
        ```

        ## Import

        Placement Groups be imported using their unique `id`, e.g.

        ```sh
        $ pulumi import linode:index/placementGroup:PlacementGroup mygroup 1234567
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] label: The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
        :param pulumi.Input[builtins.str] placement_group_policy: Whether Linodes must be able to become compliant during assignment. (Default `strict`)
        :param pulumi.Input[builtins.str] placement_group_type: The placement group type to use when placing Linodes in this group.
        :param pulumi.Input[builtins.str] region: The region of the Placement Group.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PlacementGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Linode Placement Group.
        For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-placement-group).

        ## Example Usage

        Create a Placement Group with the local anti-affinity policy:

        ```python
        import pulumi
        import pulumi_linode as linode

        test = linode.PlacementGroup("test",
            label="my-placement-group",
            region="us-mia",
            placement_group_type="anti_affinity:local")
        ```

        ## Import

        Placement Groups be imported using their unique `id`, e.g.

        ```sh
        $ pulumi import linode:index/placementGroup:PlacementGroup mygroup 1234567
        ```

        :param str resource_name: The name of the resource.
        :param PlacementGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PlacementGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 label: Optional[pulumi.Input[builtins.str]] = None,
                 placement_group_policy: Optional[pulumi.Input[builtins.str]] = None,
                 placement_group_type: Optional[pulumi.Input[builtins.str]] = None,
                 region: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PlacementGroupArgs.__new__(PlacementGroupArgs)

            if label is None and not opts.urn:
                raise TypeError("Missing required property 'label'")
            __props__.__dict__["label"] = label
            __props__.__dict__["placement_group_policy"] = placement_group_policy
            if placement_group_type is None and not opts.urn:
                raise TypeError("Missing required property 'placement_group_type'")
            __props__.__dict__["placement_group_type"] = placement_group_type
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            __props__.__dict__["is_compliant"] = None
            __props__.__dict__["members"] = None
        super(PlacementGroup, __self__).__init__(
            'linode:index/placementGroup:PlacementGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            is_compliant: Optional[pulumi.Input[builtins.bool]] = None,
            label: Optional[pulumi.Input[builtins.str]] = None,
            members: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PlacementGroupMemberArgs', 'PlacementGroupMemberArgsDict']]]]] = None,
            placement_group_policy: Optional[pulumi.Input[builtins.str]] = None,
            placement_group_type: Optional[pulumi.Input[builtins.str]] = None,
            region: Optional[pulumi.Input[builtins.str]] = None) -> 'PlacementGroup':
        """
        Get an existing PlacementGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.bool] is_compliant: Whether this Linode is currently compliant with the group's placement group type.
        :param pulumi.Input[builtins.str] label: The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
        :param pulumi.Input[Sequence[pulumi.Input[Union['PlacementGroupMemberArgs', 'PlacementGroupMemberArgsDict']]]] members: A set of Linodes currently assigned to this Placement Group.
        :param pulumi.Input[builtins.str] placement_group_policy: Whether Linodes must be able to become compliant during assignment. (Default `strict`)
        :param pulumi.Input[builtins.str] placement_group_type: The placement group type to use when placing Linodes in this group.
        :param pulumi.Input[builtins.str] region: The region of the Placement Group.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PlacementGroupState.__new__(_PlacementGroupState)

        __props__.__dict__["is_compliant"] = is_compliant
        __props__.__dict__["label"] = label
        __props__.__dict__["members"] = members
        __props__.__dict__["placement_group_policy"] = placement_group_policy
        __props__.__dict__["placement_group_type"] = placement_group_type
        __props__.__dict__["region"] = region
        return PlacementGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="isCompliant")
    def is_compliant(self) -> pulumi.Output[builtins.bool]:
        """
        Whether this Linode is currently compliant with the group's placement group type.
        """
        return pulumi.get(self, "is_compliant")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[builtins.str]:
        """
        The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def members(self) -> pulumi.Output[Sequence['outputs.PlacementGroupMember']]:
        """
        A set of Linodes currently assigned to this Placement Group.
        """
        return pulumi.get(self, "members")

    @property
    @pulumi.getter(name="placementGroupPolicy")
    def placement_group_policy(self) -> pulumi.Output[builtins.str]:
        """
        Whether Linodes must be able to become compliant during assignment. (Default `strict`)
        """
        return pulumi.get(self, "placement_group_policy")

    @property
    @pulumi.getter(name="placementGroupType")
    def placement_group_type(self) -> pulumi.Output[builtins.str]:
        """
        The placement group type to use when placing Linodes in this group.
        """
        return pulumi.get(self, "placement_group_type")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[builtins.str]:
        """
        The region of the Placement Group.
        """
        return pulumi.get(self, "region")

