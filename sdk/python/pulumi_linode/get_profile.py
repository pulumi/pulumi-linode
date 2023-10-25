# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetProfileResult',
    'AwaitableGetProfileResult',
    'get_profile',
    'get_profile_output',
]

@pulumi.output_type
class GetProfileResult:
    """
    A collection of values returned by getProfile.
    """
    def __init__(__self__, authorized_keys=None, email=None, email_notifications=None, id=None, ip_whitelist_enabled=None, lish_auth_method=None, referrals=None, restricted=None, timezone=None, two_factor_auth=None, username=None):
        if authorized_keys and not isinstance(authorized_keys, list):
            raise TypeError("Expected argument 'authorized_keys' to be a list")
        pulumi.set(__self__, "authorized_keys", authorized_keys)
        if email and not isinstance(email, str):
            raise TypeError("Expected argument 'email' to be a str")
        pulumi.set(__self__, "email", email)
        if email_notifications and not isinstance(email_notifications, bool):
            raise TypeError("Expected argument 'email_notifications' to be a bool")
        pulumi.set(__self__, "email_notifications", email_notifications)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_whitelist_enabled and not isinstance(ip_whitelist_enabled, bool):
            raise TypeError("Expected argument 'ip_whitelist_enabled' to be a bool")
        pulumi.set(__self__, "ip_whitelist_enabled", ip_whitelist_enabled)
        if lish_auth_method and not isinstance(lish_auth_method, str):
            raise TypeError("Expected argument 'lish_auth_method' to be a str")
        pulumi.set(__self__, "lish_auth_method", lish_auth_method)
        if referrals and not isinstance(referrals, dict):
            raise TypeError("Expected argument 'referrals' to be a dict")
        pulumi.set(__self__, "referrals", referrals)
        if restricted and not isinstance(restricted, bool):
            raise TypeError("Expected argument 'restricted' to be a bool")
        pulumi.set(__self__, "restricted", restricted)
        if timezone and not isinstance(timezone, str):
            raise TypeError("Expected argument 'timezone' to be a str")
        pulumi.set(__self__, "timezone", timezone)
        if two_factor_auth and not isinstance(two_factor_auth, bool):
            raise TypeError("Expected argument 'two_factor_auth' to be a bool")
        pulumi.set(__self__, "two_factor_auth", two_factor_auth)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter(name="authorizedKeys")
    def authorized_keys(self) -> Sequence[str]:
        """
        The list of SSH Keys authorized to use Lish for this user. This value is ignored if lish_auth_method is 'disabled'.
        """
        return pulumi.get(self, "authorized_keys")

    @property
    @pulumi.getter
    def email(self) -> str:
        """
        The profile email address. This address will be used for communication with Linode as necessary.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="emailNotifications")
    def email_notifications(self) -> bool:
        """
        If true, email notifications will be sent about account activity. If false, when false business-critical communications may still be sent through email.
        """
        return pulumi.get(self, "email_notifications")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipWhitelistEnabled")
    def ip_whitelist_enabled(self) -> bool:
        """
        If true, logins for the user will only be allowed from whitelisted IPs. This setting is currently deprecated, and cannot be enabled.
        """
        return pulumi.get(self, "ip_whitelist_enabled")

    @property
    @pulumi.getter(name="lishAuthMethod")
    def lish_auth_method(self) -> str:
        """
        The methods of authentication allowed when connecting via Lish. 'keys_only' is the most secure with the intent to use Lish, and 'disabled' is recommended for users that will not use Lish at all.
        """
        return pulumi.get(self, "lish_auth_method")

    @property
    @pulumi.getter
    def referrals(self) -> 'outputs.GetProfileReferralsResult':
        """
        Credit Card information associated with this Account.
        """
        return pulumi.get(self, "referrals")

    @property
    @pulumi.getter
    def restricted(self) -> bool:
        """
        If true, the user has restrictions on what can be accessed on the Account.
        """
        return pulumi.get(self, "restricted")

    @property
    @pulumi.getter
    def timezone(self) -> str:
        """
        The profile's preferred timezone. This is not used by the API, and is for the benefit of clients only. All times the API returns are in UTC.
        """
        return pulumi.get(self, "timezone")

    @property
    @pulumi.getter(name="twoFactorAuth")
    def two_factor_auth(self) -> bool:
        """
        If true, logins from untrusted computers will require Two Factor Authentication.
        """
        return pulumi.get(self, "two_factor_auth")

    @property
    @pulumi.getter
    def username(self) -> str:
        """
        The username for logging in to Linode services.
        """
        return pulumi.get(self, "username")


class AwaitableGetProfileResult(GetProfileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProfileResult(
            authorized_keys=self.authorized_keys,
            email=self.email,
            email_notifications=self.email_notifications,
            id=self.id,
            ip_whitelist_enabled=self.ip_whitelist_enabled,
            lish_auth_method=self.lish_auth_method,
            referrals=self.referrals,
            restricted=self.restricted,
            timezone=self.timezone,
            two_factor_auth=self.two_factor_auth,
            username=self.username)


def get_profile(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProfileResult:
    """
    Provides information about a Linode profile.
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getProfile:getProfile', __args__, opts=opts, typ=GetProfileResult).value

    return AwaitableGetProfileResult(
        authorized_keys=pulumi.get(__ret__, 'authorized_keys'),
        email=pulumi.get(__ret__, 'email'),
        email_notifications=pulumi.get(__ret__, 'email_notifications'),
        id=pulumi.get(__ret__, 'id'),
        ip_whitelist_enabled=pulumi.get(__ret__, 'ip_whitelist_enabled'),
        lish_auth_method=pulumi.get(__ret__, 'lish_auth_method'),
        referrals=pulumi.get(__ret__, 'referrals'),
        restricted=pulumi.get(__ret__, 'restricted'),
        timezone=pulumi.get(__ret__, 'timezone'),
        two_factor_auth=pulumi.get(__ret__, 'two_factor_auth'),
        username=pulumi.get(__ret__, 'username'))


@_utilities.lift_output_func(get_profile)
def get_profile_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetProfileResult]:
    """
    Provides information about a Linode profile.
    """
    ...
