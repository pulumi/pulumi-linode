# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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

__all__ = [
    'GetUserResult',
    'AwaitableGetUserResult',
    'get_user',
    'get_user_output',
]

@pulumi.output_type
class GetUserResult:
    """
    A collection of values returned by getUser.
    """
    def __init__(__self__, database_grants=None, domain_grants=None, email=None, firewall_grants=None, global_grants=None, id=None, image_grants=None, linode_grants=None, longview_grants=None, nodebalancer_grants=None, password_created=None, placement_group_grants=None, restricted=None, ssh_keys=None, stackscript_grants=None, tfa_enabled=None, user_type=None, username=None, verified_phone_number=None, volume_grants=None, vpc_grants=None):
        if database_grants and not isinstance(database_grants, list):
            raise TypeError("Expected argument 'database_grants' to be a list")
        pulumi.set(__self__, "database_grants", database_grants)
        if domain_grants and not isinstance(domain_grants, list):
            raise TypeError("Expected argument 'domain_grants' to be a list")
        pulumi.set(__self__, "domain_grants", domain_grants)
        if email and not isinstance(email, str):
            raise TypeError("Expected argument 'email' to be a str")
        pulumi.set(__self__, "email", email)
        if firewall_grants and not isinstance(firewall_grants, list):
            raise TypeError("Expected argument 'firewall_grants' to be a list")
        pulumi.set(__self__, "firewall_grants", firewall_grants)
        if global_grants and not isinstance(global_grants, list):
            raise TypeError("Expected argument 'global_grants' to be a list")
        pulumi.set(__self__, "global_grants", global_grants)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if image_grants and not isinstance(image_grants, list):
            raise TypeError("Expected argument 'image_grants' to be a list")
        pulumi.set(__self__, "image_grants", image_grants)
        if linode_grants and not isinstance(linode_grants, list):
            raise TypeError("Expected argument 'linode_grants' to be a list")
        pulumi.set(__self__, "linode_grants", linode_grants)
        if longview_grants and not isinstance(longview_grants, list):
            raise TypeError("Expected argument 'longview_grants' to be a list")
        pulumi.set(__self__, "longview_grants", longview_grants)
        if nodebalancer_grants and not isinstance(nodebalancer_grants, list):
            raise TypeError("Expected argument 'nodebalancer_grants' to be a list")
        pulumi.set(__self__, "nodebalancer_grants", nodebalancer_grants)
        if password_created and not isinstance(password_created, str):
            raise TypeError("Expected argument 'password_created' to be a str")
        pulumi.set(__self__, "password_created", password_created)
        if placement_group_grants and not isinstance(placement_group_grants, list):
            raise TypeError("Expected argument 'placement_group_grants' to be a list")
        pulumi.set(__self__, "placement_group_grants", placement_group_grants)
        if restricted and not isinstance(restricted, bool):
            raise TypeError("Expected argument 'restricted' to be a bool")
        pulumi.set(__self__, "restricted", restricted)
        if ssh_keys and not isinstance(ssh_keys, list):
            raise TypeError("Expected argument 'ssh_keys' to be a list")
        pulumi.set(__self__, "ssh_keys", ssh_keys)
        if stackscript_grants and not isinstance(stackscript_grants, list):
            raise TypeError("Expected argument 'stackscript_grants' to be a list")
        pulumi.set(__self__, "stackscript_grants", stackscript_grants)
        if tfa_enabled and not isinstance(tfa_enabled, bool):
            raise TypeError("Expected argument 'tfa_enabled' to be a bool")
        pulumi.set(__self__, "tfa_enabled", tfa_enabled)
        if user_type and not isinstance(user_type, str):
            raise TypeError("Expected argument 'user_type' to be a str")
        pulumi.set(__self__, "user_type", user_type)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)
        if verified_phone_number and not isinstance(verified_phone_number, str):
            raise TypeError("Expected argument 'verified_phone_number' to be a str")
        pulumi.set(__self__, "verified_phone_number", verified_phone_number)
        if volume_grants and not isinstance(volume_grants, list):
            raise TypeError("Expected argument 'volume_grants' to be a list")
        pulumi.set(__self__, "volume_grants", volume_grants)
        if vpc_grants and not isinstance(vpc_grants, list):
            raise TypeError("Expected argument 'vpc_grants' to be a list")
        pulumi.set(__self__, "vpc_grants", vpc_grants)

    @_builtins.property
    @pulumi.getter(name="databaseGrants")
    def database_grants(self) -> Sequence['outputs.GetUserDatabaseGrantResult']:
        return pulumi.get(self, "database_grants")

    @_builtins.property
    @pulumi.getter(name="domainGrants")
    def domain_grants(self) -> Sequence['outputs.GetUserDomainGrantResult']:
        return pulumi.get(self, "domain_grants")

    @_builtins.property
    @pulumi.getter
    def email(self) -> _builtins.str:
        """
        The email address for this User, for account management communications, and may be used for other communications as configured.
        """
        return pulumi.get(self, "email")

    @_builtins.property
    @pulumi.getter(name="firewallGrants")
    def firewall_grants(self) -> Sequence['outputs.GetUserFirewallGrantResult']:
        return pulumi.get(self, "firewall_grants")

    @_builtins.property
    @pulumi.getter(name="globalGrants")
    def global_grants(self) -> Sequence['outputs.GetUserGlobalGrantResult']:
        return pulumi.get(self, "global_grants")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The ID of entity this grant applies to.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="imageGrants")
    def image_grants(self) -> Sequence['outputs.GetUserImageGrantResult']:
        return pulumi.get(self, "image_grants")

    @_builtins.property
    @pulumi.getter(name="linodeGrants")
    def linode_grants(self) -> Sequence['outputs.GetUserLinodeGrantResult']:
        return pulumi.get(self, "linode_grants")

    @_builtins.property
    @pulumi.getter(name="longviewGrants")
    def longview_grants(self) -> Sequence['outputs.GetUserLongviewGrantResult']:
        return pulumi.get(self, "longview_grants")

    @_builtins.property
    @pulumi.getter(name="nodebalancerGrants")
    def nodebalancer_grants(self) -> Sequence['outputs.GetUserNodebalancerGrantResult']:
        return pulumi.get(self, "nodebalancer_grants")

    @_builtins.property
    @pulumi.getter(name="passwordCreated")
    def password_created(self) -> _builtins.str:
        """
        The date and time when this User’s current password was created. User passwords are first created during the Account sign-up process, and updated using the Reset Password webpage. null if this User has not created a password yet.
        """
        return pulumi.get(self, "password_created")

    @_builtins.property
    @pulumi.getter(name="placementGroupGrants")
    def placement_group_grants(self) -> Sequence['outputs.GetUserPlacementGroupGrantResult']:
        return pulumi.get(self, "placement_group_grants")

    @_builtins.property
    @pulumi.getter
    def restricted(self) -> _builtins.bool:
        """
        If true, this User must be granted access to perform actions or access entities on this Account.
        """
        return pulumi.get(self, "restricted")

    @_builtins.property
    @pulumi.getter(name="sshKeys")
    def ssh_keys(self) -> Sequence[_builtins.str]:
        """
        A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorized_users field of a create Linode, rebuild Linode, or create Disk request.
        """
        return pulumi.get(self, "ssh_keys")

    @_builtins.property
    @pulumi.getter(name="stackscriptGrants")
    def stackscript_grants(self) -> Sequence['outputs.GetUserStackscriptGrantResult']:
        return pulumi.get(self, "stackscript_grants")

    @_builtins.property
    @pulumi.getter(name="tfaEnabled")
    def tfa_enabled(self) -> _builtins.bool:
        """
        A boolean value indicating if the User has Two Factor Authentication (TFA) enabled.
        """
        return pulumi.get(self, "tfa_enabled")

    @_builtins.property
    @pulumi.getter(name="userType")
    def user_type(self) -> _builtins.str:
        """
        The type of this user.
        """
        return pulumi.get(self, "user_type")

    @_builtins.property
    @pulumi.getter
    def username(self) -> _builtins.str:
        return pulumi.get(self, "username")

    @_builtins.property
    @pulumi.getter(name="verifiedPhoneNumber")
    def verified_phone_number(self) -> _builtins.str:
        """
        The phone number verified for this User Profile with the Phone Number Verify command. null if this User Profile has no verified phone number.
        """
        return pulumi.get(self, "verified_phone_number")

    @_builtins.property
    @pulumi.getter(name="volumeGrants")
    def volume_grants(self) -> Sequence['outputs.GetUserVolumeGrantResult']:
        return pulumi.get(self, "volume_grants")

    @_builtins.property
    @pulumi.getter(name="vpcGrants")
    def vpc_grants(self) -> Sequence['outputs.GetUserVpcGrantResult']:
        return pulumi.get(self, "vpc_grants")


class AwaitableGetUserResult(GetUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserResult(
            database_grants=self.database_grants,
            domain_grants=self.domain_grants,
            email=self.email,
            firewall_grants=self.firewall_grants,
            global_grants=self.global_grants,
            id=self.id,
            image_grants=self.image_grants,
            linode_grants=self.linode_grants,
            longview_grants=self.longview_grants,
            nodebalancer_grants=self.nodebalancer_grants,
            password_created=self.password_created,
            placement_group_grants=self.placement_group_grants,
            restricted=self.restricted,
            ssh_keys=self.ssh_keys,
            stackscript_grants=self.stackscript_grants,
            tfa_enabled=self.tfa_enabled,
            user_type=self.user_type,
            username=self.username,
            verified_phone_number=self.verified_phone_number,
            volume_grants=self.volume_grants,
            vpc_grants=self.vpc_grants)


def get_user(database_grants: Optional[Sequence[Union['GetUserDatabaseGrantArgs', 'GetUserDatabaseGrantArgsDict']]] = None,
             domain_grants: Optional[Sequence[Union['GetUserDomainGrantArgs', 'GetUserDomainGrantArgsDict']]] = None,
             firewall_grants: Optional[Sequence[Union['GetUserFirewallGrantArgs', 'GetUserFirewallGrantArgsDict']]] = None,
             image_grants: Optional[Sequence[Union['GetUserImageGrantArgs', 'GetUserImageGrantArgsDict']]] = None,
             linode_grants: Optional[Sequence[Union['GetUserLinodeGrantArgs', 'GetUserLinodeGrantArgsDict']]] = None,
             longview_grants: Optional[Sequence[Union['GetUserLongviewGrantArgs', 'GetUserLongviewGrantArgsDict']]] = None,
             nodebalancer_grants: Optional[Sequence[Union['GetUserNodebalancerGrantArgs', 'GetUserNodebalancerGrantArgsDict']]] = None,
             placement_group_grants: Optional[Sequence[Union['GetUserPlacementGroupGrantArgs', 'GetUserPlacementGroupGrantArgsDict']]] = None,
             stackscript_grants: Optional[Sequence[Union['GetUserStackscriptGrantArgs', 'GetUserStackscriptGrantArgsDict']]] = None,
             username: Optional[_builtins.str] = None,
             volume_grants: Optional[Sequence[Union['GetUserVolumeGrantArgs', 'GetUserVolumeGrantArgsDict']]] = None,
             vpc_grants: Optional[Sequence[Union['GetUserVpcGrantArgs', 'GetUserVpcGrantArgsDict']]] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserResult:
    """
    Provides information about a Linode user
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-user).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode user.

    ```python
    import pulumi
    import pulumi_linode as linode

    foo = linode.get_user(username="foo")
    ```

    The following example shows a sample grant.


    :param _builtins.str username: The unique username of this User.
    """
    __args__ = dict()
    __args__['databaseGrants'] = database_grants
    __args__['domainGrants'] = domain_grants
    __args__['firewallGrants'] = firewall_grants
    __args__['imageGrants'] = image_grants
    __args__['linodeGrants'] = linode_grants
    __args__['longviewGrants'] = longview_grants
    __args__['nodebalancerGrants'] = nodebalancer_grants
    __args__['placementGroupGrants'] = placement_group_grants
    __args__['stackscriptGrants'] = stackscript_grants
    __args__['username'] = username
    __args__['volumeGrants'] = volume_grants
    __args__['vpcGrants'] = vpc_grants
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getUser:getUser', __args__, opts=opts, typ=GetUserResult).value

    return AwaitableGetUserResult(
        database_grants=pulumi.get(__ret__, 'database_grants'),
        domain_grants=pulumi.get(__ret__, 'domain_grants'),
        email=pulumi.get(__ret__, 'email'),
        firewall_grants=pulumi.get(__ret__, 'firewall_grants'),
        global_grants=pulumi.get(__ret__, 'global_grants'),
        id=pulumi.get(__ret__, 'id'),
        image_grants=pulumi.get(__ret__, 'image_grants'),
        linode_grants=pulumi.get(__ret__, 'linode_grants'),
        longview_grants=pulumi.get(__ret__, 'longview_grants'),
        nodebalancer_grants=pulumi.get(__ret__, 'nodebalancer_grants'),
        password_created=pulumi.get(__ret__, 'password_created'),
        placement_group_grants=pulumi.get(__ret__, 'placement_group_grants'),
        restricted=pulumi.get(__ret__, 'restricted'),
        ssh_keys=pulumi.get(__ret__, 'ssh_keys'),
        stackscript_grants=pulumi.get(__ret__, 'stackscript_grants'),
        tfa_enabled=pulumi.get(__ret__, 'tfa_enabled'),
        user_type=pulumi.get(__ret__, 'user_type'),
        username=pulumi.get(__ret__, 'username'),
        verified_phone_number=pulumi.get(__ret__, 'verified_phone_number'),
        volume_grants=pulumi.get(__ret__, 'volume_grants'),
        vpc_grants=pulumi.get(__ret__, 'vpc_grants'))
def get_user_output(database_grants: Optional[pulumi.Input[Optional[Sequence[Union['GetUserDatabaseGrantArgs', 'GetUserDatabaseGrantArgsDict']]]]] = None,
                    domain_grants: Optional[pulumi.Input[Optional[Sequence[Union['GetUserDomainGrantArgs', 'GetUserDomainGrantArgsDict']]]]] = None,
                    firewall_grants: Optional[pulumi.Input[Optional[Sequence[Union['GetUserFirewallGrantArgs', 'GetUserFirewallGrantArgsDict']]]]] = None,
                    image_grants: Optional[pulumi.Input[Optional[Sequence[Union['GetUserImageGrantArgs', 'GetUserImageGrantArgsDict']]]]] = None,
                    linode_grants: Optional[pulumi.Input[Optional[Sequence[Union['GetUserLinodeGrantArgs', 'GetUserLinodeGrantArgsDict']]]]] = None,
                    longview_grants: Optional[pulumi.Input[Optional[Sequence[Union['GetUserLongviewGrantArgs', 'GetUserLongviewGrantArgsDict']]]]] = None,
                    nodebalancer_grants: Optional[pulumi.Input[Optional[Sequence[Union['GetUserNodebalancerGrantArgs', 'GetUserNodebalancerGrantArgsDict']]]]] = None,
                    placement_group_grants: Optional[pulumi.Input[Optional[Sequence[Union['GetUserPlacementGroupGrantArgs', 'GetUserPlacementGroupGrantArgsDict']]]]] = None,
                    stackscript_grants: Optional[pulumi.Input[Optional[Sequence[Union['GetUserStackscriptGrantArgs', 'GetUserStackscriptGrantArgsDict']]]]] = None,
                    username: Optional[pulumi.Input[_builtins.str]] = None,
                    volume_grants: Optional[pulumi.Input[Optional[Sequence[Union['GetUserVolumeGrantArgs', 'GetUserVolumeGrantArgsDict']]]]] = None,
                    vpc_grants: Optional[pulumi.Input[Optional[Sequence[Union['GetUserVpcGrantArgs', 'GetUserVpcGrantArgsDict']]]]] = None,
                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetUserResult]:
    """
    Provides information about a Linode user
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-user).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode user.

    ```python
    import pulumi
    import pulumi_linode as linode

    foo = linode.get_user(username="foo")
    ```

    The following example shows a sample grant.


    :param _builtins.str username: The unique username of this User.
    """
    __args__ = dict()
    __args__['databaseGrants'] = database_grants
    __args__['domainGrants'] = domain_grants
    __args__['firewallGrants'] = firewall_grants
    __args__['imageGrants'] = image_grants
    __args__['linodeGrants'] = linode_grants
    __args__['longviewGrants'] = longview_grants
    __args__['nodebalancerGrants'] = nodebalancer_grants
    __args__['placementGroupGrants'] = placement_group_grants
    __args__['stackscriptGrants'] = stackscript_grants
    __args__['username'] = username
    __args__['volumeGrants'] = volume_grants
    __args__['vpcGrants'] = vpc_grants
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('linode:index/getUser:getUser', __args__, opts=opts, typ=GetUserResult)
    return __ret__.apply(lambda __response__: GetUserResult(
        database_grants=pulumi.get(__response__, 'database_grants'),
        domain_grants=pulumi.get(__response__, 'domain_grants'),
        email=pulumi.get(__response__, 'email'),
        firewall_grants=pulumi.get(__response__, 'firewall_grants'),
        global_grants=pulumi.get(__response__, 'global_grants'),
        id=pulumi.get(__response__, 'id'),
        image_grants=pulumi.get(__response__, 'image_grants'),
        linode_grants=pulumi.get(__response__, 'linode_grants'),
        longview_grants=pulumi.get(__response__, 'longview_grants'),
        nodebalancer_grants=pulumi.get(__response__, 'nodebalancer_grants'),
        password_created=pulumi.get(__response__, 'password_created'),
        placement_group_grants=pulumi.get(__response__, 'placement_group_grants'),
        restricted=pulumi.get(__response__, 'restricted'),
        ssh_keys=pulumi.get(__response__, 'ssh_keys'),
        stackscript_grants=pulumi.get(__response__, 'stackscript_grants'),
        tfa_enabled=pulumi.get(__response__, 'tfa_enabled'),
        user_type=pulumi.get(__response__, 'user_type'),
        username=pulumi.get(__response__, 'username'),
        verified_phone_number=pulumi.get(__response__, 'verified_phone_number'),
        volume_grants=pulumi.get(__response__, 'volume_grants'),
        vpc_grants=pulumi.get(__response__, 'vpc_grants')))
