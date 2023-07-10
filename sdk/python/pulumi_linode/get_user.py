# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
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
    def __init__(__self__, database_grants=None, domain_grants=None, email=None, firewall_grants=None, global_grants=None, id=None, image_grants=None, linode_grants=None, longview_grants=None, nodebalancer_grants=None, restricted=None, ssh_keys=None, stackscript_grants=None, username=None, volume_grants=None):
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
        if restricted and not isinstance(restricted, bool):
            raise TypeError("Expected argument 'restricted' to be a bool")
        pulumi.set(__self__, "restricted", restricted)
        if ssh_keys and not isinstance(ssh_keys, list):
            raise TypeError("Expected argument 'ssh_keys' to be a list")
        pulumi.set(__self__, "ssh_keys", ssh_keys)
        if stackscript_grants and not isinstance(stackscript_grants, list):
            raise TypeError("Expected argument 'stackscript_grants' to be a list")
        pulumi.set(__self__, "stackscript_grants", stackscript_grants)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)
        if volume_grants and not isinstance(volume_grants, list):
            raise TypeError("Expected argument 'volume_grants' to be a list")
        pulumi.set(__self__, "volume_grants", volume_grants)

    @property
    @pulumi.getter(name="databaseGrants")
    def database_grants(self) -> Sequence['outputs.GetUserDatabaseGrantResult']:
        """
        The grants this User has pertaining to Databases on this Account.
        """
        return pulumi.get(self, "database_grants")

    @property
    @pulumi.getter(name="domainGrants")
    def domain_grants(self) -> Sequence['outputs.GetUserDomainGrantResult']:
        """
        The grants this User has pertaining to Domains on this Account.
        """
        return pulumi.get(self, "domain_grants")

    @property
    @pulumi.getter
    def email(self) -> str:
        """
        The email address for this User, for account management communications, and may be used for other communications as configured.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="firewallGrants")
    def firewall_grants(self) -> Sequence['outputs.GetUserFirewallGrantResult']:
        """
        The grants this User has pertaining to Firewalls on this Account.
        """
        return pulumi.get(self, "firewall_grants")

    @property
    @pulumi.getter(name="globalGrants")
    def global_grants(self) -> Sequence['outputs.GetUserGlobalGrantResult']:
        """
        The Account-level grants a User has.
        """
        return pulumi.get(self, "global_grants")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="imageGrants")
    def image_grants(self) -> Sequence['outputs.GetUserImageGrantResult']:
        """
        The grants this User has pertaining to Images on this Account.
        """
        return pulumi.get(self, "image_grants")

    @property
    @pulumi.getter(name="linodeGrants")
    def linode_grants(self) -> Sequence['outputs.GetUserLinodeGrantResult']:
        """
        The grants this User has pertaining to Linodes on this Account.
        """
        return pulumi.get(self, "linode_grants")

    @property
    @pulumi.getter(name="longviewGrants")
    def longview_grants(self) -> Sequence['outputs.GetUserLongviewGrantResult']:
        """
        The grants this User has pertaining to Longview Clients on this Account.
        """
        return pulumi.get(self, "longview_grants")

    @property
    @pulumi.getter(name="nodebalancerGrants")
    def nodebalancer_grants(self) -> Sequence['outputs.GetUserNodebalancerGrantResult']:
        """
        The grants this User has pertaining to NodeBalancers on this Account.
        """
        return pulumi.get(self, "nodebalancer_grants")

    @property
    @pulumi.getter
    def restricted(self) -> bool:
        """
        If true, this User must be granted access to perform actions or access entities on this Account.
        """
        return pulumi.get(self, "restricted")

    @property
    @pulumi.getter(name="sshKeys")
    def ssh_keys(self) -> Sequence[str]:
        """
        A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorized_users field of a create Linode, rebuild Linode, or create Disk request.
        """
        return pulumi.get(self, "ssh_keys")

    @property
    @pulumi.getter(name="stackscriptGrants")
    def stackscript_grants(self) -> Sequence['outputs.GetUserStackscriptGrantResult']:
        """
        The grants this User has pertaining to StackScripts on this Account.
        """
        return pulumi.get(self, "stackscript_grants")

    @property
    @pulumi.getter
    def username(self) -> str:
        return pulumi.get(self, "username")

    @property
    @pulumi.getter(name="volumeGrants")
    def volume_grants(self) -> Sequence['outputs.GetUserVolumeGrantResult']:
        """
        The grants this User has pertaining to Volumes on this Account.
        """
        return pulumi.get(self, "volume_grants")


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
            restricted=self.restricted,
            ssh_keys=self.ssh_keys,
            stackscript_grants=self.stackscript_grants,
            username=self.username,
            volume_grants=self.volume_grants)


def get_user(database_grants: Optional[Sequence[pulumi.InputType['GetUserDatabaseGrantArgs']]] = None,
             domain_grants: Optional[Sequence[pulumi.InputType['GetUserDomainGrantArgs']]] = None,
             firewall_grants: Optional[Sequence[pulumi.InputType['GetUserFirewallGrantArgs']]] = None,
             image_grants: Optional[Sequence[pulumi.InputType['GetUserImageGrantArgs']]] = None,
             linode_grants: Optional[Sequence[pulumi.InputType['GetUserLinodeGrantArgs']]] = None,
             longview_grants: Optional[Sequence[pulumi.InputType['GetUserLongviewGrantArgs']]] = None,
             nodebalancer_grants: Optional[Sequence[pulumi.InputType['GetUserNodebalancerGrantArgs']]] = None,
             stackscript_grants: Optional[Sequence[pulumi.InputType['GetUserStackscriptGrantArgs']]] = None,
             username: Optional[str] = None,
             volume_grants: Optional[Sequence[pulumi.InputType['GetUserVolumeGrantArgs']]] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserResult:
    """
    Provides information about a Linode user


    :param Sequence[pulumi.InputType['GetUserDatabaseGrantArgs']] database_grants: The grants this User has pertaining to Databases on this Account.
    :param Sequence[pulumi.InputType['GetUserDomainGrantArgs']] domain_grants: The grants this User has pertaining to Domains on this Account.
    :param Sequence[pulumi.InputType['GetUserFirewallGrantArgs']] firewall_grants: The grants this User has pertaining to Firewalls on this Account.
    :param Sequence[pulumi.InputType['GetUserImageGrantArgs']] image_grants: The grants this User has pertaining to Images on this Account.
    :param Sequence[pulumi.InputType['GetUserLinodeGrantArgs']] linode_grants: The grants this User has pertaining to Linodes on this Account.
    :param Sequence[pulumi.InputType['GetUserLongviewGrantArgs']] longview_grants: The grants this User has pertaining to Longview Clients on this Account.
    :param Sequence[pulumi.InputType['GetUserNodebalancerGrantArgs']] nodebalancer_grants: The grants this User has pertaining to NodeBalancers on this Account.
    :param Sequence[pulumi.InputType['GetUserStackscriptGrantArgs']] stackscript_grants: The grants this User has pertaining to StackScripts on this Account.
    :param str username: The unique username of this User.
    :param Sequence[pulumi.InputType['GetUserVolumeGrantArgs']] volume_grants: The grants this User has pertaining to Volumes on this Account.
    """
    __args__ = dict()
    __args__['databaseGrants'] = database_grants
    __args__['domainGrants'] = domain_grants
    __args__['firewallGrants'] = firewall_grants
    __args__['imageGrants'] = image_grants
    __args__['linodeGrants'] = linode_grants
    __args__['longviewGrants'] = longview_grants
    __args__['nodebalancerGrants'] = nodebalancer_grants
    __args__['stackscriptGrants'] = stackscript_grants
    __args__['username'] = username
    __args__['volumeGrants'] = volume_grants
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
        restricted=pulumi.get(__ret__, 'restricted'),
        ssh_keys=pulumi.get(__ret__, 'ssh_keys'),
        stackscript_grants=pulumi.get(__ret__, 'stackscript_grants'),
        username=pulumi.get(__ret__, 'username'),
        volume_grants=pulumi.get(__ret__, 'volume_grants'))


@_utilities.lift_output_func(get_user)
def get_user_output(database_grants: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetUserDatabaseGrantArgs']]]]] = None,
                    domain_grants: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetUserDomainGrantArgs']]]]] = None,
                    firewall_grants: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetUserFirewallGrantArgs']]]]] = None,
                    image_grants: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetUserImageGrantArgs']]]]] = None,
                    linode_grants: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetUserLinodeGrantArgs']]]]] = None,
                    longview_grants: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetUserLongviewGrantArgs']]]]] = None,
                    nodebalancer_grants: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetUserNodebalancerGrantArgs']]]]] = None,
                    stackscript_grants: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetUserStackscriptGrantArgs']]]]] = None,
                    username: Optional[pulumi.Input[str]] = None,
                    volume_grants: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetUserVolumeGrantArgs']]]]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetUserResult]:
    """
    Provides information about a Linode user


    :param Sequence[pulumi.InputType['GetUserDatabaseGrantArgs']] database_grants: The grants this User has pertaining to Databases on this Account.
    :param Sequence[pulumi.InputType['GetUserDomainGrantArgs']] domain_grants: The grants this User has pertaining to Domains on this Account.
    :param Sequence[pulumi.InputType['GetUserFirewallGrantArgs']] firewall_grants: The grants this User has pertaining to Firewalls on this Account.
    :param Sequence[pulumi.InputType['GetUserImageGrantArgs']] image_grants: The grants this User has pertaining to Images on this Account.
    :param Sequence[pulumi.InputType['GetUserLinodeGrantArgs']] linode_grants: The grants this User has pertaining to Linodes on this Account.
    :param Sequence[pulumi.InputType['GetUserLongviewGrantArgs']] longview_grants: The grants this User has pertaining to Longview Clients on this Account.
    :param Sequence[pulumi.InputType['GetUserNodebalancerGrantArgs']] nodebalancer_grants: The grants this User has pertaining to NodeBalancers on this Account.
    :param Sequence[pulumi.InputType['GetUserStackscriptGrantArgs']] stackscript_grants: The grants this User has pertaining to StackScripts on this Account.
    :param str username: The unique username of this User.
    :param Sequence[pulumi.InputType['GetUserVolumeGrantArgs']] volume_grants: The grants this User has pertaining to Volumes on this Account.
    """
    ...
