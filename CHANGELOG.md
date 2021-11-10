CHANGELOG
=========

## HEAD (Unreleased)
* Upgrade to terraform-bridge 3.11.0
* Upgrade to pulumi 3.17.0

---

## 3.4.0 (2021-09-27)
* Upgrade to v1.21.0 of the Linode Terraform Provider
* Upgrade to pulumi v3.11.0
* Upgrade to pulumi-terraform-bridge v3.6.0

## 3.3.2 (2021-09-01)
* Upgrade to v1.20.2 of the Linode Terraform Provider

## 3.3.1 (2021-08-19)
* Upgrade to v1.20.1 of the Linode Terraform Provider

## 3.3.0 (2021-08-12)
* Upgrade to v1.20.0 of the Linode Terraform Provider

## 3.2.0 (2021-06-28)
* Upgrade to v1.19.1 of the Linode Terraform Provider

## 3.1.0 (2021-05-21)
* Upgrade to v1.18.0 of the Linode Terraform Provider  
  **PLEASE NOTE:**  
  * This provider no longer supports `linode.index.vlan` as this has been replaced upstream. Previously, an instance_id
    was passed to a VLan. It has now been changed in the Linode API to pass VLan details to the Instance as part of 
    the `interfaces` configuration

## 3.0.1 (2021-04-30)
* Upgrade to v1.17.1 of the Linode Terraform Provider

## 3.0.0 (20201-04-19)
* Upgrade to v1.17.0 of the Linode Terraform Provider
* Depend on Pulumi 3.0, which includes improvements to Python resource arguments and key translation, Go SDK performance,
  Node SDK performance, general availability of Automation API, and more.

## 2.11.0 (2021-04-12)
* Upgrade to pulumi-terraform-bridge v2.23.0

## 2.10.1 (2021-03-23)
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 2.10.0 (2021-03-16)
* Upgrade to v1.16.0 of the Linode Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binary

## 2.9.1 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

## 2.9.0 (2021-02-01)
* Upgrade to v1.14.3 of the Linode Terraform Provider
* Upgrading pulumi-terraform-bridge to v2.18.1

## 2.8.1 (2021-01-27)
* Upgrade to v1.14.1 of the Linode Terraform Provider

## 2.8.0 (2021-01-12)
* Upgrade to v1.14.0 of the Linode Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.17.0
* Upgrade to pulumi v2.16.2

## 2.7.3 (2020-11-23)
* Upgrade to v1.13.4 of the Linode Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.13.2  
  * This adds support for import specific examples in documentation

## 2.7.2 (2020-11-09)
* Upgrade to pulumi-terraform-bridge v2.12.1

## 2.7.1 (2020-10-28)
* Upgrade to v1.13.3 of the Linode Terraform Provider

## 2.7.0 (2020-10-26)
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 2.6.2 (2020-10-09)
* Upgrade to v1.13.2 of the Linode Terraform Provider

## 2.6.1 (2020-09-24)
* Upgrade to v1.13.1 of the Linode Terraform Provider

## 2.6.0 (2020-09-21)
* Upgrade to pulumi-terraform-bridge v2.8.0
* Upgrade to Pulumi v2.10.0
* Upgrade to v1.13.0 of the Linode Terraform Provider

## 2.5.0 (2020-08-31)
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python

## 2.4.4 (2020-06-11)
* Switch to GitHub actions for build

## 2.4.3 (2020-06-08)
* Upgrade to v1.12.3 of the Linode Terraform Provider
  **Please Note:** v1.12.3 was a mistagged Terraform release

## 2.4.2 (2020-06-06)
* Upgrade to v1.11.2 of the Linode Terraform Provider

## 2.4.1 (2020-05-28)
* Upgrade to Pulumi v2.3.0
* Upgrade to pulumi-terraform-bridge v2.4.0
* Upgrade to v1.11.1 of the Linode Terraform Provider

## 2.4.0 (2020-05-27)
* Upgrade to pulumi-terraform-bridge v2.3.3
* Upgrade to v1.11.0 of the Linode Terraform Provider

## 2.3.1 (2020-05-12)
* Upgrade to pulumi-terraform-bridge v2.3.1

## 2.3.0 (2020-05-05)
* Upgrade to v1.10.0 of the Linode Terraform Provider

## 2.2.0 (2020-04-28)
* Regenerate datasource examples to be async
* Upgrade to pulumi-terraform-bridge v2.1.0

## 2.1.0 (2020-04-21)
* Upgrade to v1.9.3 of the Linode Terraform Provider

## 2.0.0 (2020-04-17)
* Upgrade to Pulumi v2.0.0
* Upgrade to pulumi-terraform-bridge v2.0.0

## 1.7.0 (2020-04-14)
* Refactor layout to use Go modules

## 1.6.0 (2020-03-23)
* Upgrade to Pulumi v1.12.1
* Upgrade to pulumi-terraform-bridge v1.8.2

## 1.5.0 (2020-02-27)
* Upgrade to v1.9.2 of the Linode Terraform Provider

## 1.4.0 (2020-01-29)
* Upgrade to pulumi-terraform-bridge v1.6.4

## 1.3.0 (2020-01-02)
* Upgrade to pulumi-terraform-bridge v1.5.2

## 1.2.0 (2019-12-09)
* Upgrade to v1.9.1 of the Linode Terraform Provider

## 1.1.0 (2019-12-04)
* Upgrade to support go 1.13.x
* Upgrade to pulumi-terraform-bridge v1.4.3
* Upgrade to v1.9.0 of the Linode Terraform Provider

## 1.0.0 (2019-11-15)
* Regenerate SDK based on tf2pulumi 0.6.0
* Add support for DotNet SDK Generation

## 0.18.11 (2019-09-05)
* Upgrade to Pulumi v1.0.0

## 0.18.10 (2019-08-29)
* Upgrade pulumi-terraform to 3f206601e7

## 0.18.9 (2019-08-20)
* Depend on latest pulumi package

## 0.18.8 (2019-08-09)
* Upgrade to pulumi-terraform@9db2fc93cd

## 0.18.7 (2019-08-08)
* Update to pulumi-terraform@013b95b1c8

## 0.18.6 (2019-07-16)
* Upgrade to v1.8.0 of the Linode Terraform Provider

## 0.18.5 (2019-07-09)
* Fix detailed diffs with nested computed values.

## 0.18.4 (2019-07-08)
* Update to v1.7.0 of the Linode Terraform Provider

## 0.18.3 (2019-07-08)
* Communicate detailed information about the difference between a resource's desired and actual state during a Pulumi update

## 0.18.2 (2019-06-21)
* Add TypeScript type guards for each resource class ([7ace3e9b5f](https://github.com/pulumi/pulumi-terraform/commit/7ace3e9b5f2dcd4692b029ba4b80360582d7949a))
* Update to pulumi-terraform@3635bed3a5 which stops maps containing `.` being treated as nested maps.

## 0.18.1 (2019-05-28)
* Update `pulumi-terraform` to the latest version

## 0.18.0 (2019-05-06)
* Initial release of the Linode provider, based on v1.6.0 of the Linode Terraform provider
